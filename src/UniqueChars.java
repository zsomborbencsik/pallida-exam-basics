import java.util.ArrayList;
import java.util.Collections;

public class UniqueChars {
    public static void main(String[] args) {
        // Create a function called `uniqueCharacters` that takes a string as parameter
        // and returns a list with the unique letters of the given string
        // Create basic unit tests for it with at least 3 different test cases
        System.out.println(uniqueCharacters("anagram"));
        // Should print out:
        // ["n", "g", "r", "m"]
    }
    public static  ArrayList<Character> uniqueCharacters (String word) {
        ArrayList<Character> uniqueChars = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (!uniqueChars.contains(word.charAt(i))) {
                uniqueChars.add(word.charAt(i));
            }
        }
        return uniqueChars;
    }
}