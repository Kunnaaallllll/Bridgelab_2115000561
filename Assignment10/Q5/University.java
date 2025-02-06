import java.util.*;
public class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDepartment(Department department) {
        department.setUniversity(this); 
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void removeFaculty(Faculty faculty) {
        faculties.remove(faculty);
    }

    public void printDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department department : departments) {
            System.out.println(department);
        }
        System.out.println("Faculty members:");
        for (Faculty faculty : faculties) {
            System.out.println(faculty);
        }
    }

    public void deleteUniversity() {
        System.out.println("Deleting University: " + name);
        for (Department dept : departments) {
            System.out.println("Deleting Department: " + dept.getName());
        }
        departments.clear();
    }
}
