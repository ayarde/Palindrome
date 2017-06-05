package palindrome;

import java.util.Scanner;

/**
 * Created by adrian.ayarde on 02/06/2017.
 */
public class PalindromeMain {

    public static final String MESSAGE_ENTER_WORD = "Enter a word, to check if it is a palindrome.";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        StringBuffer word;
        System.out.println(MESSAGE_ENTER_WORD);
        word = new StringBuffer(entrada.nextLine());

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.validatePalindromeWord(word));
    }
}
