public interface MyFirstInterface {
  int x = 0;

  void display();
}

// 1. Try to declare the variable with/without public static final keywords. Is there any difference between these two approaches? Why?
//No. Whether you mention it or not, every variable you define in Java should be initialised because interfaces may only store constants. 
//Doing so will make the variable implicitly public, static, and final, preventing it from being altered again.

//2. Declare the abstract method with/without abstract keyword. Is there any difference between these two approaches? Why?
//Making the methods inside an interface abstract has no effect since interfaces in Java are always abstract, whether you declare so explicitly or not.
 //This is so that objects cannot be created directly via interfaces or abstract classes.
 //To construct an object, abstract classes must be inherited and interfaces must be implemented.

//3.Implement this into a class called “IntefaceImplemented” . Override all the abstract methods. Try to change the value of x inside this method and print the value of x. 
//Is it possible for you to change x? why?
//Because a method cannot be overridden or a variable's value changed when the final modifier is present, this results in a compilation error.
