class SubC extends SuperB {
    void triple() {
        x = x + 3; // overrides the existing triple() method from the superclass
    }

    void quadruple() {
        x = x * 4; // defines a new method specific to SubC class
    }
}


//The `SubC` class is a subclass of `SuperB`. It inherits the fields and methods of `SuperB`. 
//It overrides the `triple()` method from the superclass and provides its own implementation. 
//Additionally, it introduces a new method called `quadruple()`.
