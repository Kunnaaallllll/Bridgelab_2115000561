import java.util.*;
public class Professor {
    private String name;
    private List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    
    public void assignProfessor(Course course) {
        courses.add(course);
        course.setProfessor(this); 
        System.out.println(name + " is assigned to teach " + course.getCourseName());
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return name;
    }
}