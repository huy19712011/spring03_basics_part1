/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S06_dependency_check;

import java.util.List;
import org.springframework.beans.factory.annotation.Required;

/**
 *
 * @author huynq
 */
public class Prescription {

    private int id;
    private String patientName;
    private List<String> medicines;

    @Override
    public String toString() {
        return "Prescription{" + "id=" + id + ", patientName=" + patientName + ", medicines=" + medicines + '}';
    }



    public int getId() {
        return id;
    }

    @Required
    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public List<String> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<String> medicines) {
        this.medicines = medicines;
    }




}
