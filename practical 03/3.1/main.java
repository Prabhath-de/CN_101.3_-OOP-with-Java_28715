public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Set values using setters
        emp.setName("John Doe");
        emp.setAge(30);
        emp.setSalary(50000.0);

        // Get values using getters and print them
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}


Employee Name: John Doe
Employee Age: 30
Employee Salary: 50000.0
