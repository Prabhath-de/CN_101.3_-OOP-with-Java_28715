public class TestPerson {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 101, "Computer Science");

        // Create a Lecturer object
        Lecturer lecturer = new Lecturer("Jane Smith", 201, "Mathematics");

        // Access and print details using getters
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Course: " + student.getCourse());

        System.out.println("\nLecturer Details:");
        System.out.println("Name: " + lecturer.getName());
        System.out.println("ID: " + lecturer.getId());
        System.out.println("Programme: " + lecturer.getProgramme());
    }
}


//Output:


//Student Details:
//Name: John Doe
//ID: 101
//Course: Computer Science

//Lecturer Details:
//Name: Jane Smith
//ID: 201
//Programme: Mathematics


//In this code, the 'Person' class serves as the superclass, and both 'Student' and 'Lecturer' classes are subclasses that extend the 'Person' class. 
//The common attributes and behaviors are stored in the 'Person' class, 
//and specific attributes and behaviors for students and lecturers are stored in their respective subclasses. 
//The test class creates objects of 'Student' and 'Lecturer', sets their details using constructors, and retrieves and prints those details using getters.
