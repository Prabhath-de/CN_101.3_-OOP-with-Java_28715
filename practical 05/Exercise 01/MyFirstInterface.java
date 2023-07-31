public interface MyFirstInterface {
    int x = 10; // Declaration of variable 'x' (implicitly public, static, and final)

    void display(); // Abstract method declaration (implicitly abstract)
}


//Declaring the variable with/without public static final keywords:

//In the interface, we declared the variable 'x' without explicitly using the `public`, `static`, and `final` keywords. 
//However, in an interface, all variables are implicitly public, static, and final, which means that the variable 'x' is treated 
//as `public static final int x = 10;` even though we didn't explicitly specify these keywords. 
//There is no difference between declaring the variable with or without these keywords because they are automatically added 
//by the Java compiler for variables in an interface.
