import java.util.*;
public class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    
    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName() + ".");
    }

    public List<Patient> getPatients() {
        return patients;
    }

    @Override
    public String toString() {
        return name;
    }
}