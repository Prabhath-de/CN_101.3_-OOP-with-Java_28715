public class TestShape {
    public static void main(String[] args) {
        // Create a Circle object and calculate its area
        Circle circle = new Circle(5.0);
        circle.display();

        // Create a Rectangle object and calculate its area
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.display();
    }
}


//Output:


//Area: 78.53981633974483
//Area: 24.0

//In this code, we have the `Shape` class with an abstract method `calculateArea` and a non-abstract method `display`. 
//The `Circle` and `Rectangle` classes are subclasses of `Shape` and they implement the `calculateArea` method based on their specific shape formulas. 
//We pass the required values (radius for the circle and length and width for the rectangle) at the instantiation of the subclass objects. 
//When we call the `display` method on these objects, it calculates and displays the area of the corresponding shapes.
