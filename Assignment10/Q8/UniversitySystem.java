public class UniversitySystem {
    public static void main(String[] args) {
        
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Algorithms");

        professor1.assignProfessor(course1);
        professor2.assignProfessor(course2);

    
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

    
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);

        student2.enrollCourse(course1);

        
        System.out.println("\nCourses enrolled by " + student1.getName() + ":");
        for (Course course : student1.getCourses()) {
            System.out.println(course);
        }

        System.out.println("\nCourses enrolled by " + student2.getName() + ":");
        for (Course course : student2.getCourses()) {
            System.out.println(course);
        }


        System.out.println("\nStudents in " + course1.getCourseName() + ":");
        for (Student student : course1.getStudents()) {
            System.out.println(student);
        }

        System.out.println("\nStudents in " + course2.getCourseName() + ":");
        for (Student student : course2.getStudents()) {
            System.out.println(student);
        }
    }
}