public class Main {
    public static void main(String[] args) {
        
        University university = new University("GLA University");
        
        Department csDepartment = new Department("Computer Science");
        Department eeDepartment = new Department("Electrical Engineering");

        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");

        university.addDepartment(csDepartment);
        university.addDepartment(eeDepartment);
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        university.printDetails();
        university.deleteUniversity();
        university.printDetails();
    }
}