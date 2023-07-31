public class TestEmployee {
    public static void main(String[] args) {
        // Create an Employee object using the constructor
        Employee emp = new Employee("John Doe", 30, 50000.0);

        // Get values using getters and print them
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}


//The output will remain the same as before:

//Employee Name: John Doe
//Employee Age: 30
//Employee Salary: 50000.0
