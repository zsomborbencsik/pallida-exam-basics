import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UniqueCharsTest {
    @Test
    public void uniqueCharactersTest() throws Exception {
        UniqueChars word = new UniqueChars();
        ArrayList<Character> testArray = new ArrayList<>(Arrays.asList('n','g','r','m'));
        assertEquals(testArray,word.uniqueCharacters("anagram") );
    }
    @Test
    public void uniqueCharactersTest2() throws Exception {
        UniqueChars word = new UniqueChars();
        ArrayList<Character> testArray = new ArrayList<>(Arrays.asList('n','g','r','m'));
        assertEquals(testArray,word.uniqueCharacters("anabbgram") );
    }
    @Test
    public void uniqueCharactersTest3() throws Exception {
        UniqueChars word = new UniqueChars();
        ArrayList<Character> testArray = new ArrayList<>(Arrays.asList());
        assertEquals(testArray,word.uniqueCharacters("bbbbbbbb") );
    }
}