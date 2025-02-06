import java.util.*;
public class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void consult(Doctor doctor) {
        doctors.add(doctor);
        doctor.consult(this); 
    }

    @Override
    public String toString() {
        return name;
    }
}