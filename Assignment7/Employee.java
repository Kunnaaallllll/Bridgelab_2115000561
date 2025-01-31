public class Employee {
    private String name;
    private int id;
    private int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Name of an Employee is: " + name);
        System.out.println("ID of an Employee is: " + id);
        System.out.println("Salary of an Employee is: " + salary);
    }
}
