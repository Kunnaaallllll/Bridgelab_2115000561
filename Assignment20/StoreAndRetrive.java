import java.io.*;
import java.util.*;

class StoreAndRetrive {
    private static final String fileName = "employees.dat";

    public static void serialize(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employees);
            System.out.println("Serialization Done.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static List<Employee> deserialize() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Employee>) ois.readObject();
        } catch (Exception e) {
            System.out.println(e);
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Kunal", "HR", 70000));
        employees.add(new Employee(2, "Anuj", "IT", 55000));
        employees.add(new Employee(3, "Ayush", "Finance", 75000));

        serialize(employees);

        List<Employee> emp = deserialize();
        System.out.println("Deserialized Employees:");
        emp.forEach(Employee::display);
    }
}
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name, department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + department + ", Salary: " + salary);
    }
}
