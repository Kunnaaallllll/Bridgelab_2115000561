import java.util.*;
public class main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of an Employee: ");
        String name = sc.nextLine();
        System.out.print("Enter the Employee ID: ");
        int id = sc.nextInt();
        System.out.println("Enter the salary of an Employee: ");
        int salary = sc.nextInt();
        Employee emp = new Employee(name , id, salary);
        emp.displayDetails();
    }
}
