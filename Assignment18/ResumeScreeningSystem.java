import java.util.*;
abstract class JobRole{
    private String candidateName;
    JobRole(String candidateName){
        this.candidateName=candidateName;
    }
public String getCandidateName(){
        return candidateName;
}
}
class SoftwareEngineer extends JobRole{
    SoftwareEngineer(String candidateName){
        super(candidateName);
    }
}

class DataScientist extends JobRole{
    DataScientist(String candidateName){
        super(candidateName);
    }
}
class ProductManager extends JobRole{
    ProductManager(String candidateName){
        super(candidateName);
    }
}
class Resume<T extends JobRole>{
    List<T> list;
    Resume(){
        list=new ArrayList<>();
    }
    public void addResume(T resume){
        list.add(resume);
    }
    public void processResume(){
        for(T resume:list){
            System.out.println(resume.getCandidateName());
        }
    }
    public static void processMoreResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            System.out.println(resume.getCandidateName());
        }
    }
}
public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> se = new Resume<>();
        se.addResume(new SoftwareEngineer("kunal"));
        se.addResume(new SoftwareEngineer("arush"));
        Resume<DataScientist> ds = new Resume<>();
        ds.addResume(new DataScientist("bhagyodaya"));
        ds.addResume(new DataScientist("ayush"));
        Resume<ProductManager> pm = new Resume<>();
        pm.addResume(new ProductManager("anuj"));
        pm.addResume(new ProductManager("puneet"));
        System.out.println("Processing Individual Resumes:");
        se.processResume();
        ds.processResume();
        pm.processResume();
        System.out.println("\nProcessing Multiple Job Roles:");
        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(new SoftwareEngineer("kunal"));
        allResumes.add(new DataScientist("bhagyodaya"));
        allResumes.add(new ProductManager("anuj"));
        Resume.processMoreResumes(allResumes);
    }
}
