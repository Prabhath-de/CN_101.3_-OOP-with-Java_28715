//1. Classes:

//- `Animal` class is a superclass.
//- `Mammal` class is a subclass of `Animal`.
//- `Reptile` class is another subclass of `Animal`.
//- `Dog` class is a subclass of `Mammal`.

//2. The `Dog` class contains the `main` method where instances of `Animal`, `Mammal`, and `Dog` are created and tested using the `instanceof` operator.

//3. `main` method:


public static void main(String args[]) {
    Animal a = new Animal();
    Mammal m = new Mammal();
    Dog d = new Dog();

    System.out.println(m instanceof Animal);
    System.out.println(d instanceof Mammal);
    System.out.println(d instanceof Animal);
}


//4. Output Explanation:

//- `m instanceof Animal`: This statement checks if the object `m` (of type `Mammal`) is an instance of the `Animal` class. 
//Since `Mammal` is a subclass of `Animal`, the result is `true`.
//- `d instanceof Mammal`: This statement checks if the object `d` (of type `Dog`) is an instance of the `Mammal` class. 
//Since `Dog` is a subclass of `Mammal`, the result is `true`.
//- `d instanceof Animal`: This statement checks if the object `d` (of type `Dog`) is an instance of the `Animal` class. 
//Since `Dog` is also a subclass of `Animal`, the result is `true`.

//5. Output:

//true
//true
//true


//In the given code, the `instanceof` operator is used to check the inheritance relationship between classes.
//Since Java follows the "is-a" relationship in inheritance, an object of a subclass can be treated as an object of its superclass.

//- A `Mammal` is an `Animal`.
//- A `Dog` is a `Mammal`, and it is also an `Animal`.

//Hence, the output shows that all the `instanceof` checks return `true`, 
//indicating that the objects are instances of the specified classes in the inheritance hierarchy. 
