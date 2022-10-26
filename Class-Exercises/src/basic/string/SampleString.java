package basic.string;

import java.util.Scanner;

public class SampleString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String sentence = input.nextLine();
        int palindromeCount = checkPalindromeWords(sentence);
        System.out.println(palindromeCount);
    }

    /**
     * Reverse the word
     *
     * @param word The word
     * @return Reverse of word
     */
    static String reverse(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
            // It is not the optimal method for working with strings in java, but it is a suitable method for you now!
        }
        return reversedWord;
    }

    /**
     * Checking a string is equal with another string
     * @param word1 A string
     * @param word2 Another string
     * @return `True` for being equal words, `False` for being disparate words
     */
    static boolean isEqual(String word1, String word2) {
        String word1_lowerCase = word1.toLowerCase();
        String word2_lowerCase = word2.toLowerCase();
        return word1_lowerCase.equals(word2_lowerCase);
    }

    /**
     * Checking words for being palindrome
     *
     * @param word The word for checking
     * @return 'true' for palindrome word
     */
    static boolean isPalindrome(String word) {
        String reversed = reverse(word);
        return isEqual(word, reversed);
    }

    /**
     * Checking words in a sentence for finding palindrome words, and returning the count of them.
     *
     * @param sentence The sentence for checking
     * @return Count of palindrome words in the sentence
     */
    static int checkPalindromeWords(String sentence) {
        int palindromeCounter = 0;
        for (String word : sentence.split(" ")) {
            if (isPalindrome(word)) {
                palindromeCounter++;
            }
        }
        return palindromeCounter;
    }
}
