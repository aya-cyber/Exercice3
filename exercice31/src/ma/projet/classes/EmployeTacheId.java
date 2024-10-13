package ma.projet.classes;

import java.io.Serializable;
import java.util.Objects;

public class EmployeTacheId implements Serializable {
    private int employeId;
    private int tacheId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeTacheId)) return false;
        EmployeTacheId that = (EmployeTacheId) o;
        return employeId == that.employeId && tacheId == that.tacheId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeId, tacheId);
    }
}
