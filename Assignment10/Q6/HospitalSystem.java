public class HospitalSystem {
    public static void main(String[] args) {
        
        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Johnson");


        Patient patient1 = new Patient("John Doe");
        Patient patient2 = new Patient("Jane Doe");


        Hospital hospital = new Hospital();
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        
        hospital.displayDetails();

        patient1.consult(doctor1);
        patient1.consult(doctor2);
        patient2.consult(doctor1);

        System.out.println("\nPatients consulted by " + doctor1.getName() + ":");
        for (Patient p : doctor1.getPatients()) {
            System.out.println(p.getName());
        }
    }
}