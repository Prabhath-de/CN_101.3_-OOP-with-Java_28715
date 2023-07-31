public class LoopExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        

        // Using break
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.println(x);
        }
        System.out.println("I'm out of the Loop now");

        // Using continue
        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            System.out.println(x);
        }
        System.out.println("I'm out of the Loop now");
    }
}

//output using 'break'
//10
//20
//I'm out of the Loop now

//output using 'continue'
//10

//20
//40
//50
//I'm out of the Loop now

