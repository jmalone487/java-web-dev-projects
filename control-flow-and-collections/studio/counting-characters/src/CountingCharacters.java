import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        // Step 1: Get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = input.nextLine();

        // Step 2: Convert the input to lowercase to make counting case-insensitive
        text = text.toLowerCase();

        // Step 3: Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Step 4: Loop through the string and count each character (alphabetic only)
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) { // Only include alphabetic characters
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Step 5: Print the results
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

