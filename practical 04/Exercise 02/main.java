public class TestInheritance {
    public static void main(String[] args) {
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println(b.returnIt());

        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println(c.returnIt());
    }
}
```

//In the `TestInheritance` class, we create an instance of `SuperB` called `b` and an instance of `SubC` called `c`.
//We then perform a series of operations on these instances.

//Execution steps and output:

//1. We create an instance `b` of class `SuperB`. The value of `x` is set to 2 using `setIt(2)`.
//2. We increase the value of `x` by 1 using `increase()` method, so `x` becomes 3.
//3. We triple the value of `x` using `triple()` method, so `x` becomes 9.
//4. We print the value of `x` using `returnIt()` method, which prints 9.

//Next,

//1. We create an instance `c` of class `SubC`. The value of `x` is set to 2 using `setIt(2)`.
//2. We increase the value of `x` by 1 using `increase()` method, so `x` becomes 3.
//3. We triple the value of `x` using `triple()` method from the `SubC` class (which overrides the method), so `x` becomes 6 (not 9 as in the superclass).
//4. We print the value of `x` using `returnIt()` method, which prints 6.

//Conclusion:
//In this scenario, we demonstrated inheritance where `SubC` inherits from `SuperB`. 
//The subclass `SubC` overrides the `triple()` method to provide its own implementation, and it also introduces a new method `quadruple()`. 
//The output shows how the overridden method works differently in the subclass compared to the superclass.
