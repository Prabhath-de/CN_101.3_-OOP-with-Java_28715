public class Student extends Person {
    private String course;

    // Constructor
    public Student(String name, int id, String course) {
        super(name, id); // Call the superclass constructor
        this.course = course;
    }

    // Getter and Setter for course
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
