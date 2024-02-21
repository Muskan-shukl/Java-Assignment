import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting values into a 3x3 array
        int[][] array = new int[3][3];
        System.out.println("Enter values into a 3x3 array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter value for position (" + (i + 1) + ", " + (j + 1) + "): ");
                array[i][j] = scanner.nextInt();
            }
        }

        if (isSpecialArray(array)) {
            System.out.println("The array is special.");
        } else {
            System.out.println("The array is not special.");
        }
    }

    public static boolean isSpecialArray(int[][] array) {
        int evenSum = 0, oddSum = 0;

        // Calculate sum of even and odd elements
        for (int[] row : array) {
            for (int num : row) {
                if (num % 2 == 0) {
                    evenSum += num;
                } else {
                    oddSum += num;
                }
            }
        }

        return evenSum == oddSum;
    }
}
