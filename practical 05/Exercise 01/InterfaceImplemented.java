public class InterfaceImplemented implements MyFirstInterface {
    // Implementing the abstract method
    @Override
    public void display() {
        // Trying to change the value of 'x'
        // x = 20; // This will result in a compilation error
        System.out.println("Value of x inside display(): " + x);
    }

    public static void main(String[] args) {
        InterfaceImplemented obj = new InterfaceImplemented();
        obj.display();
    }
}


//2. Declaring the abstract method with/without the abstract keyword:

//In the interface, we declared the method 'display' without explicitly using the `abstract` keyword. 
//However, in an interface, all methods are implicitly abstract, and they don't require the `abstract` keyword. 
//The interface only contains method signatures, and the actual implementation is provided in the implementing class. 
//There is no difference between declaring the method with or without the `abstract` keyword because they are automatically treated 
//as abstract by the Java compiler.

//3. Trying to change the value of 'x' inside the method 'display':

I//In the `InterfaceImplemented` class, we tried to change the value of 'x' inside the `display` method, but it resulted in a compilation error. 
//This is because the variable 'x' declared in the interface is implicitly final (constant), and its value cannot be changed after initialization.
//So, attempting to modify the value of 'x' inside the `display` method like `x = 20;` will cause a compilation error saying: "cannot assign 
//a value to final variable x."

//Since 'x' is a constant defined in the interface, its value is fixed and cannot be changed by any class implementing the interface. 
//The purpose of such constant variables is to provide shared constant values that cannot be modified throughout the program.
