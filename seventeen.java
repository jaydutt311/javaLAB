 import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
 public class seventeen{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        String[] words = input.split("\\W+");
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println("Word occurrences:");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        scanner.close();
    }
}


