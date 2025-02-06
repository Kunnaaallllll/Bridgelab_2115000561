import java.util.*;
public class Hospital {
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    
    public void displayDetails() {
        System.out.println("Doctors in the hospital:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());
        }

        System.out.println("\nPatients in the hospital:");
        for (Patient patient : patients) {
            System.out.println(patient.getName());
        }
    }
}
