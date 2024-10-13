package ma.projet.classes;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private String prenom;
    private String telephone;

    @OneToMany(mappedBy = "chefDeProjet")
    private Set<Projet> projetsGeres = new HashSet<>();

    @ManyToMany
    @JoinTable(
        name = "EmployeTache",
        joinColumns = @JoinColumn(name = "employe_id"),
        inverseJoinColumns = @JoinColumn(name = "tache_id")
    )
    private Set<Tache> taches = new HashSet<>();

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Projet> getProjetsGeres() {
        return projetsGeres;
    }

    public void setProjetsGeres(Set<Projet> projetsGeres) {
        this.projetsGeres = projetsGeres;
    }

    public Set<Tache> getTaches() {
        return taches;
    }

    public void setTaches(Set<Tache> taches) {
        this.taches = taches;
    }
}
