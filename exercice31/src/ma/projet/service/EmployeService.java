package ma.projet.service;

import ma.projet.classes.Employe;
import ma.projet.dao.IDao;
import ma.projet.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeService implements IDao<Employe> {
    
    @Override
    public boolean create(Employe employe) {
        Transaction transaction = null;
        Session session=null;
        try {
            session=HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(employe);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Employe getById(int id) {
        Session session=null;
        try {
            session= HibernateUtil.getSessionFactory().openSession();
            return (Employe) session.get(Employe.class, id);
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Employe> getAll() {
        Session session = null;
        try{
            return session.createQuery("from Employe").list();
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
