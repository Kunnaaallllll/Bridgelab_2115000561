import java.util.*;
class Employee {
    String name,department;
    Employee(String name,String department){
        this.name=name;
        this.department=department;
    }
    public String toString(){
        return name;
    }
}
public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees=Arrays.asList(
            new Employee("Alice","HR"),
            new Employee("Bob","IT"),
            new Employee("Carol","HR")
        );
        System.out.println(groupByDepartment(employees));
    }
    public static Map<String,List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String,List<Employee>> grouped=new HashMap<>();
        for(Employee e:employees){
            if(!grouped.containsKey(e.department)){
                grouped.put(e.department,new ArrayList<>());
            }
            grouped.get(e.department).add(e);
        }
        return grouped;
    }
}
