public abstract class Shape {
    // Abstract method to calculate the area
    public abstract double calculateArea();

    // Non-abstract method to display the shape details
    public void display() {
        System.out.println("Area: " + calculateArea());
    }
}
