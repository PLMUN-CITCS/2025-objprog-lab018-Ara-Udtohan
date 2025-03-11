import java.util.Scanner;

public class EvenOddChecker {
    
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
    
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
    
    public static void main(String[] args) {
        int number = getIntegerInput();
        String result = checkEvenOrOdd(number);
        System.out.println(result);
    }
}
