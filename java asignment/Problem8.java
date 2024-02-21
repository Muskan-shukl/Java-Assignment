import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a time string (e.g., '4h 20m 10s'): ");
        String timeString = scanner.nextLine();

        int totalSeconds = convertToSeconds(timeString);
        System.out.println("Total number of seconds: " + totalSeconds);
    }

    public static int convertToSeconds(String timeString) {
        String[] parts = timeString.split("\\s+"); 
        int hours = 0, minutes = 0, seconds = 0;

        // Iterate through the parts and extract hours, minutes, and seconds
        for (String part : parts) {
            if (part.endsWith("h")) {
                hours = Integer.parseInt(part.substring(0, part.length() - 1));
            } else if (part.endsWith("m")) {
                minutes = Integer.parseInt(part.substring(0, part.length() - 1));
            } else if (part.endsWith("s")) {
                seconds = Integer.parseInt(part.substring(0, part.length() - 1));
            }
        }

        // Calculate total seconds
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        return totalSeconds;
    }
}
