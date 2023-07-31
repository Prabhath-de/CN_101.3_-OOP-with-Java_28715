public class TestEmployee {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee bogdan = new Employee();
        Employee bird = new Employee();

        // Set values using setters for Mr. Bogdan
        bogdan.setEmpID(101);
        bogdan.setEmpName("Bogdan");
        bogdan.setEmpDesignation("Software Engineer");

        // Set values using setters for Ms. Bird
        bird.setEmpID(102);
        bird.setEmpName("Bird");
        bird.setEmpDesignation("Graphic Designer");

        // Print employee details using getters
        System.out.println("Employee 1 Details:");
        System.out.println("ID: " + bogdan.getEmpID());
        System.out.println("Name: " + bogdan.getEmpName());
        System.out.println("Designation: " + bogdan.getEmpDesignation());

        System.out.println("\nEmployee 2 Details:");
        System.out.println("ID: " + bird.getEmpID());
        System.out.println("Name: " + bird.getEmpName());
        System.out.println("Designation: " + bird.getEmpDesignation());
    }
}



//Output:


//Employee 1 Details:
//ID: 101
//Name: Bogdan
//Designation: Software Engineer

//Employee 2 Details:
//ID: 102
//Name: Bird
//Designation: Graphic Designer
