public class TestEmployee {
    public static void main(String[] args) {
        // Create an Employee object using the constructor
        Employee emp = new Employee("Bogdan", 50000, 10000);

        // Use setters to set values (though not needed in this example)
        emp.setName("Bogdan");
        emp.setBasicSalary(50000);
        emp.setBonus(10000);

        // Use getters to retrieve values and print them
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Bonus: " + emp.getBonus());
        System.out.println("Bonus Amount: " + emp.calculateBonusAmount());
    }
}


//Output:


//Employee Name: Bogdan
//Basic Salary: 50000.0
//Bonus: 10000.0
//Bonus Amount: 60000.0
