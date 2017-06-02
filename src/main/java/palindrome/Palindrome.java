package palindrome;

/**
 * Created by adrian.ayarde on 02/06/2017.
 */
public class Palindrome {

    public static final String WORD_IS_PALINDROME = "The word is palindrome.";
    public static final String WORD_IS_NOT_PALINDROME = "The word is not palindrome.";

    public String validatePalindromeWord(StringBuffer word){
        int pos = 0;
        StringBuffer invertedWord = null;
        String s1, s2= null;
        String result = null;
        while (pos < word.length()) {
            if (!Character.isLetter(word.charAt(pos))) {
                word.deleteCharAt(pos);
            } else {
                pos++;
            }
        }

        invertedWord = new StringBuffer(word);
        invertedWord.reverse();
        s1 = word.toString();
        s2 = invertedWord.toString();

        if (s1.equalsIgnoreCase(s2)) {
            result = WORD_IS_PALINDROME;
        } else {
            result = WORD_IS_NOT_PALINDROME;
        }
        return result;
    }
}
