public class StudentRecordManagement {
    public static void main(String[] args) {
        Student student = new Student(2115000561, "kunal", 22, "B");
        student = student.addNewStudent(2115000146, "bhagyodaya", 22, "A", student);
        student = student.addNewStudentAtEnd(2115000147, "anuj", 22, "A", student);
        student.displayAllRecords(student);
        System.out.println();
        student = student.deleteRecord(2115000561, student);
        student.displayAllRecords(student);
        System.out.println();
        student.searchStudent(2115000146, student);
        student.displayAllRecords(student);
        student.updateStudentsGrade(2115000147, student, "Z");
        student.displayAllRecords(student);
    }
}
class Student {
    int rollNo;
    String name;
    int age;
    String grade;
    Student next;

    public Student(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }

    public static Student addNewStudent(int rollNo, String name, int age, String grade, Student student) {
        Student newStudent = new Student(rollNo, name, age, grade);
        newStudent.next = student;
        return newStudent;
    }

    public static void displayAllRecords(Student student) {
        while (student != null) {
            System.out.print("  " + student.name);
            System.out.print("  " + student.rollNo);
            System.out.print("  " + student.age);
            System.out.print("  " + student.grade);
            student = student.next;
            System.out.println();
        }
    }

    public static Student addNewStudentAtEnd(int rollNo, String name, int age, String grade, Student student) {
        Student newStudent = new Student(rollNo, name, age, grade);
        if (student == null) {
            return newStudent;
        }
        Student temp = student;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
        return student;
    }
    public static Student deleteRecord(int rollNo, Student student) {
        if (student == null) {
            return null;
        }
        if (student.rollNo == rollNo) {
            return student.next;
        }
        Student temp = student;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return student;
    }
    public static void searchStudent(int rollNo, Student student) {
        Student temp = student;
        while (temp != null && temp.rollNo != rollNo) {
            temp = temp.next;
        }
        if (temp != null) {
            System.out.println(temp.name);
        }
    }
    public static void updateStudentsGrade(int rollNo, Student student, String grade) {
        Student temp = student;
        while (temp != null && temp.rollNo != rollNo) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.grade = grade;
            System.out.println("record updated");
        }
    }
}
