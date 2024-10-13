package ma.projet.test;

import ma.projet.classes.Employe;
import ma.projet.classes.Projet;
import ma.projet.classes.Tache;
import ma.projet.service.EmployeService;
import ma.projet.service.ProjetService;
import ma.projet.service.TacheService;
import ma.projet.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
    public static void main(String[] args) {
        // Créer une session factory
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        // Services
        EmployeService employeService = new EmployeService();
        ProjetService projetService = new ProjetService();
        TacheService tacheService = new TacheService();

        try {
            // Créer un employé
            Employe employe = new Employe();
            employe.setNom("Dupont");
            employe.setPrenom("Jean");
            employe.setTelephone("0606060606");
            employeService.create(employe);
            System.out.println("Employé créé : " + employe.getNom());

            // Créer un projet
            Projet projet = new Projet();
            projet.setNom("Gestion de Stock");
     
            projetService.create(projet);
            System.out.println("Projet créé : " + projet.getNom());

            // Créer une tâche
            Tache tache = new Tache();
            tache.setNom("Analyse des besoins");
            tache.setPrix(1500); // Prix en DH
            tacheService.create(tache);
            System.out.println("Tâche créée : " + tache.getNom());

            // Afficher tous les employés
            System.out.println("Liste des employés :");
            for (Employe emp : employeService.getAll()) {
                System.out.println(emp.getNom() + " " + emp.getPrenom());
            }

            // Afficher tous les projets
            System.out.println("Liste des projets :");
            for (Projet proj : projetService.getAll()) {
                System.out.println(proj.getNom());
            }

            // Afficher toutes les tâches
            System.out.println("Liste des tâches :");
            for (Tache t : tacheService.getAll()) {
                System.out.println(t.getNom() + " - Prix: " + t.getPrix() + " DH");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
