import java.util.Arrays;
import java.util.Comparator;

public class Problem9 {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "kiwi", "grape"};

        // Sorting the array using a custom comparator
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
              
                int lengthComparison = Integer.compare(s1.length(), s2.length());
                if (lengthComparison != 0) {
                    return lengthComparison; 
                } else {
                    
                    return s1.compareTo(s2);
                }
            }
        });

        // Printing the sorted array
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

