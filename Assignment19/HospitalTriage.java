import java.util.*;
public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue=new PriorityQueue<>(new Comparator<Patient>(){
            public int compare(Patient a,Patient b){
                return b.severity-a.severity;
            }
        });
        queue.add(new Patient("John",3));
        queue.add(new Patient("Alice",5));
        queue.add(new Patient("Bob",2));
        while(!queue.isEmpty()){
            System.out.println(queue.remove().name);
        }
    }
}
class Patient{
    String name;
    int severity;
    public Patient(String name,int severity){
        this.name=name;
        this.severity=severity;
    }
}
