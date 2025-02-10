import java.util.*;
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> emp=new ArrayList<>();
        FullTimeEmployee emp1=new FullTimeEmployee(101,30000,"Kunal",6);
        PartTimeEmployee emp2=new PartTimeEmployee(102,30000,"Arush",8);
        emp1.assignDepartment("IT");
        emp2.assignDepartment("HR");
        emp.add(emp1);
        emp.add(emp2);

        for(Employee e:emp){
           e.displayDetails();
            System.out.println("Total Salary : "+e.calculateSalary());
           if(e instanceof Department){
               System.out.println((((Department) e).getDepartmentDetails()));
           }
        }

    }
}
abstract class Employee{
    private int employeeId,baseSalary;
    private String name;
    Employee(int employeeId, int baseSalary,String name){
        this.employeeId=employeeId;
        this.baseSalary=baseSalary;
        this.name=name;
    }
    abstract int calculateSalary();

    public void displayDetails(){
        System.out.println("employeeId is : "+employeeId);
        System.out.println("baseSalary is : "+baseSalary);
        System.out.println("Name of employee is : "+name);
    }
    public int getBaseSalary(){
        return baseSalary;
    }
}
class FullTimeEmployee extends Employee implements Department{
    private int workHour;
    private String departmentName;
    FullTimeEmployee(int employeeId, int baseSalary,String name , int workHour) {
        super(employeeId, baseSalary, name);
        this.workHour=workHour;
    }
    @Override
    public int calculateSalary(){
        int salary=getBaseSalary()*workHour;
        return salary;
    }
    public void assignDepartment(String departmentName){
        this.departmentName=departmentName;
    }
    public String getDepartmentDetails(){
        return departmentName;
    }
}
class PartTimeEmployee extends Employee implements Department{
    private int workHour;
    private String departmentName;
    PartTimeEmployee(int employeeId, int baseSalary,String name , int workHour) {
        super(employeeId, baseSalary, name);
        this.workHour=workHour;
    }
    @Override
    public int calculateSalary(){
        int salary=getBaseSalary()*workHour;
        return salary;
    }
    public void assignDepartment(String departmentName){
        this.departmentName=departmentName;
    }
    public String getDepartmentDetails(){
        return departmentName;
    }
}

interface Department{
    void assignDepartment(String departmentName);
     String getDepartmentDetails();
}