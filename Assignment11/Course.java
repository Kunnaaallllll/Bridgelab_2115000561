class Course {
    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Course Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee After Discount: " + getFinalFee());
    }
}

public class CourseManagementSystem {
    public static void main(String[] args) {
        Course basicCourse = new Course("Mathematics", 6);
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 8, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Data Science", 12, "Coursera", true, 500, 20);
        System.out.println("Basic Course Details Are ->");
        basicCourse.displayDetails();
        System.out.println("Online Course Details Are ->");
        onlineCourse.displayDetails();
        System.out.println("Paid Online Course Details Are");
        paidCourse.displayDetails();
    }
}

