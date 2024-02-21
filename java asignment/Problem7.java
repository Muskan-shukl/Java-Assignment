import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting two integers from the user
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Checking for overflow in addition
        boolean additionOverflow = checkAdditionOverflow(num1, num2);

        // Checking for overflow in multiplication
        boolean multiplicationOverflow = checkMultiplicationOverflow(num1, num2);

        // Displaying the result
        if (additionOverflow) {
            System.out.println("Addition will result in overflow.");
        } else {
            System.out.println("Addition will not result in overflow.");
        }

        if (multiplicationOverflow) {
            System.out.println("Multiplication will result in overflow.");
        } else {
            System.out.println("Multiplication will not result in overflow.");
        }
    }

    public static boolean checkAdditionOverflow(int num1, int num2) {
        // Check if the sum exceeds the maximum or minimum value for an integer
        return (num1 > 0 && num2 > Integer.MAX_VALUE - num1) || (num1 < 0 && num2 < Integer.MIN_VALUE - num1);
    }

    public static boolean checkMultiplicationOverflow(int num1, int num2) {
        // Check if the product exceeds the maximum or minimum value for an integer
        return (num1 != 0 && num2 != 0 &&
                (num2 > Integer.MAX_VALUE / num1 || num2 < Integer.MIN_VALUE / num1));
    }
}
