import java.util.*;
public class Department {

    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    public void displayDetails() {
        System.out.println("  Department: " + name);
        for (Employee employee : employees) {
            System.out.println("    Employee: " + employee.getName());
        }
    }
}
