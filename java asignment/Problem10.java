import java.util.Arrays;

public class Problem10 {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 9, 5, 1}; // Example array of numbers

        int sum = findMinMaxSum(numbers);
        System.out.println("Sum of the smallest and largest numbers: " + sum);
    }

    public static int findMinMaxSum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        Arrays.sort(numbers);

        int smallest = numbers[0];

        int largest = numbers[numbers.length - 1];

        // Sum of the smallest and largest numbers
        return smallest + largest;
    }
}

