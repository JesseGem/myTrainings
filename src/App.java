public class App {
    public static void main(String[] args) throws Exception {
        
        // Define all operators
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for Modulus");
        
        // Take input from the user
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Choose an operator: ");
        int choice = scanner.nextInt();
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

            // Check if inputs are integers

        if (num1 != (int) num1 || num2 != (int) num2) {
            System.out.println("Please enter integer values only.");
            return;
        }

        // Call the calculator method
        Calculator.calculate(choice, num1, num2);
        
    }
}
