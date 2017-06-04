package palindrome;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by adrian.ayarde on 02/06/2017.
 */
public class PalindromeTest {
    public static final String WORD_IS_PALINDROME = "The word is palindrome.";
    public static final String WORD_IS_NOT_PALINDROME = "The word is not palindrome.";

    @Test
    public void isPalindromeWord(){
        Palindrome palindrome = new Palindrome();
        String result = null;
        StringBuffer word = new StringBuffer("neuquen");
        result = palindrome.validatePalindromeWord(word);

        assertTrue(result.equals(WORD_IS_PALINDROME));
    }

    @Test
    public void isNotPalindromeWord(){
        Palindrome palindrome = new Palindrome();
        String result = null;
        StringBuffer word = new StringBuffer("dog");
        result = palindrome.validatePalindromeWord(word);

        assertTrue(result.equals(WORD_IS_NOT_PALINDROME));
    }
}
