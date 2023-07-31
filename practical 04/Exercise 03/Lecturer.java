public class Lecturer extends Person {
    private String programme;

    // Constructor
    public Lecturer(String name, int id, String programme) {
        super(name, id); // Call the superclass constructor
        this.programme = programme;
    }

    // Getter and Setter for programme
    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
}
