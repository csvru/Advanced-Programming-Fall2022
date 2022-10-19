package basic.string;

import java.util.Scanner;

public class SampleString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String sentence = input.nextLine();
        int countOfSymmetric = checkSymmetricWords(sentence);
        System.out.println(countOfSymmetric);
    }

    /**
     * Reverse the word
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
     * Checking a string is equal with its reversed string
     * @param word1 A string
     * @param word2 reversed of `str`
     * @return `True` for being equal words, `False` for being disparate words
     */
    static boolean isEqual(String word1, String word2) {
        /*
        if(word1.length() != word2.length()) return false;
        for(int i = 0; i < word1.length(); i++) {
            if(word1.charAt(i) != word2.charAt(i)) {
                return false;
            }
        }
        return true;
        */
        return word1.equals(word2);
    }

    /**
     * Checking words for being symmetric or asymmetric
     * @param word The word for checking
     * @return True for symmetric word, False for asymmetric
     */
    static boolean isSymmetric(String word){
        String reversed = reverse(word);
        return isEqual(word, reversed);
    }

    /**
     * Checking words in a sentence for finding symmetric words, and returning the count of symmetries.
     * @param sentence  The sentence for checking
     * @return Count of symmetric words in the sentence
     */
    static int checkSymmetricWords(String sentence) {
        int symmetricCount = 0;
        for(String word: sentence.split(" ")){
            if(isSymmetric(word)){
                symmetricCount++;
            }
        }
        return symmetricCount;
    }
}
