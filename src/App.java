import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display operator options
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for Modulus");

        // Get validated integer input for operator
        int choice = getIntInput(scanner, "Choose an operator: ");

        // Get validated double inputs for numbers
        double num1 = getDoubleInput(scanner, "Enter first number: ");
        double num2 = getDoubleInput(scanner, "Enter second number: ");

        // Check if inputs are integers
        if (num1 != (int) num1 || num2 != (int) num2) {
            System.out.println("Please enter integer values only.");
            return;
        }

        // Call the calculator method
        Calculator.calculate(choice, num1, num2);
    }

    // Method to get validated integer input
    public static int getIntInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // discard invalid input
            }
        }
    }

    // Method to get validated double input
    public static double getDoubleInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // discard invalid input
            }
        }
    }
}
