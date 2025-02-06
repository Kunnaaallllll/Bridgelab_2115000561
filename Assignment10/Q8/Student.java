import java.util.*;
public class Student {

    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); 
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return name;
    }
}
