import java.util.*;
abstract class CourseType{
    private String courseName;
    CourseType(String courseName){
        this.courseName=courseName;
    }
    public String getCourseName(){
        return courseName;
    }
}
class ExamCourse extends CourseType{
    ExamCourse(String courseName){
        super(courseName);
    }
}
class AssignmentCourse extends CourseType{
    AssignmentCourse(String courseName){
        super(courseName);
    }
}
class ResearchCourse extends CourseType{
    ResearchCourse(String courseName){
        super(courseName);
    }
}
class Course<T extends CourseType>{
    List<T> list;
    Course(){
        list=new ArrayList<>();
    }
    public void addItem(T course){
        list.add(course);
    }
    void display(){
        for(T item:list){
            System.out.println(item.getCourseName());
        }
    }
}
public class UniversityCourseManagement {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addItem(new ExamCourse("Math 101"));
        examCourses.addItem(new ExamCourse("Physics 101"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addItem(new AssignmentCourse("Java Assignment"));
        assignmentCourses.addItem(new AssignmentCourse("Database Assignment"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addItem(new ResearchCourse("AI Research"));
        researchCourses.addItem(new ResearchCourse("Quantum Computing Research"));
        System.out.println("Exam Courses:");
        examCourses.display();

        System.out.println("\nAssignment Courses:");
        assignmentCourses.display();

        System.out.println("\nResearch Courses:");
        researchCourses.display();
    }
}
