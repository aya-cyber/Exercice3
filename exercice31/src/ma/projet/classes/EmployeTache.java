package ma.projet.classes;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(EmployeTacheId.class)
public class EmployeTache {
    @Id
    private int employeId;

    @Id
    private int tacheId;

    private java.util.Date dateDebutReelle;
    private java.util.Date dateFinReelle;

    // Getters and Setters
    public int getEmployeId() {
        return employeId;
    }

    public void setEmployeId(int employeId) {
        this.employeId = employeId;
    }

    public int getTacheId() {
        return tacheId;
    }

    public void setTacheId(int tacheId) {
        this.tacheId = tacheId;
    }

    public java.util.Date getDateDebutReelle() {
        return dateDebutReelle;
    }

    public void setDateDebutReelle(java.util.Date dateDebutReelle) {
        this.dateDebutReelle = dateDebutReelle;
    }

    public java.util.Date getDateFinReelle() {
        return dateFinReelle;
    }

    public void setDateFinReelle(java.util.Date dateFinReelle) {
        this.dateFinReelle = dateFinReelle;
    }
}
