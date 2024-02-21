import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting input from the user
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the yearly rate of interest (in percentage): ");
        double yearlyRate = scanner.nextDouble() / 100; // Convert percentage to decimal

        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        // Calculating total interest earned
        double totalInterest = calculateInterest(principal, yearlyRate, months);

        // Displaying the result
        System.out.println("Total interest earned: $" + totalInterest);
    }

    public static double calculateInterest(double principal, double yearlyRate, int months) {
        // Convert yearly rate to monthly rate
        double monthlyRate = yearlyRate / 12;

        // Calculate total interest using the formula for compound interest
        double totalInterest = principal * (Math.pow(1 + monthlyRate, months) - 1);

        return totalInterest;
    }
}
