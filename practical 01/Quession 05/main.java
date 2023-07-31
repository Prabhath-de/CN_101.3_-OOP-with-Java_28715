public class GradeChecker {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            // Add more cases for other grades if needed

            default:
                System.out.println("Invalid grade!");
                break;
        }
    }
}

//Output: 
//Excellent!
