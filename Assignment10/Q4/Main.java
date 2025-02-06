public class Main {
    public static void main(String[] args) {
       
        School school = new School("Greenwood High");

        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
       
        school.addStudent(student1);
        school.addStudent(student2);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");
       
        student1.enrollInCourse(math);
        student1.enrollInCourse(science);
        student2.enrollInCourse(math);

        school.displayStudents();

        student1.viewEnrolledCourses();
        student2.viewEnrolledCourses();

        math.viewEnrolledStudents();
        science.viewEnrolledStudents();
    }
}