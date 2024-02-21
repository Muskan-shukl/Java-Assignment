import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        // Counting the number of uppercase and lowercase letters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            }
        }

        // Printing the counts
        System.out.println("Number of uppercase letters: " + upperCaseCount);
        System.out.println("Number of lowercase letters: " + lowerCaseCount);

        // Checking if counts are equal
        if (upperCaseCount == lowerCaseCount) {
            System.out.println("The string contains an equal number of uppercase and lowercase letters.");
        } else {
            System.out.println("The string does not contain an equal number of uppercase and lowercase letters.");
        }
    }
}
