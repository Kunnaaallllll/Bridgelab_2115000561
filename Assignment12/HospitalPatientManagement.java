public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient patient1 = new InPatient(101, "Kunal", 45, 5);
        Patient patient2 = new OutPatient(102, "Arush", 30, 2);
        
        System.out.println("Total bill for InPatient: " + patient1.calculateBill());
        patient1.getPatientDetails();
        ((MedicalRecord) patient1).addRecord("Diagnosed with fever");
        ((MedicalRecord) patient1).viewRecords();
        
        System.out.println("Total bill for OutPatient: " + patient2.calculateBill());
        patient2.getPatientDetails();
        ((MedicalRecord) patient2).addRecord("General checkup");
        ((MedicalRecord) patient2).viewRecords();
    }
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    
    Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    
    abstract int calculateBill();
    
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private String medicalHistory = "";
    
    InPatient(int patientId, String name, int age, int daysAdmitted) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
    }
    
    @Override
    int calculateBill() {
        return daysAdmitted * 2000;
    }
    
    @Override
    public void addRecord(String record) {
        medicalHistory += record + "; ";
    }
    
    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private int visits;
    private String medicalHistory = "";
    
    OutPatient(int patientId, String name, int age, int visits) {
        super(patientId, name, age);
        this.visits = visits;
    }
    
    @Override
    int calculateBill() {
        return visits * 500;
    }
    
    @Override
    public void addRecord(String record) {
        medicalHistory += record + "; ";
    }
    
    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}
