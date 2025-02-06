public class Department {
    private String name;
    private University university; 

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Department: " + name;
    }
}
