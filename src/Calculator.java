public class Calculator {
    public static void calculate(int choice, double num1, double num2) {
        double result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            case 5:
                result = num1 % num2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}

