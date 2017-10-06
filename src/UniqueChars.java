import java.util.ArrayList;
import java.util.Collections;

public class UniqueChars {
    public static void main(String[] args) {
        // Create a function called `uniqueCharacters` that takes a string as parameter
        // and returns a list with the unique letters of the given string
        // Create basic unit tests for it with at least 3 different test cases
        // Should print out:
        // ["n", "g", "r", "m"]
    }
    public  ArrayList<Character> uniqueCharacters (String word) {
        ArrayList<Character> uniqueChars = new ArrayList<>();
        ArrayList<Character> notSoUniqueChars = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            if (!uniqueChars.contains(word.charAt(i))) {
                uniqueChars.add(word.charAt(i));
            } else {
                notSoUniqueChars.add(word.charAt(i));
            }
        }

        /*Removing the first instances of the recurring letters.*/
        for (int i = 0; i < notSoUniqueChars.size(); i++) {
            if (uniqueChars.contains(notSoUniqueChars.get(i))) {
                uniqueChars.remove(uniqueChars.indexOf(notSoUniqueChars.get(i)));
            }
        }
        return uniqueChars;
    }
}
