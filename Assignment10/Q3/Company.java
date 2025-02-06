import java.util.*;
public class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        departments.add(department);
    }

    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                department.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department not found: " + departmentName);
    }

    public void displayCompanyDetails() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayDetails();
        }
    }

    public void deleteCompany() {
        System.out.println("Deleting company: " + name);
        departments.clear();
    }
}