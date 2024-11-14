/*
 * Jonathan Graydon
 * Unique Punctuation Marks in a Sentence
 * This program will take in a sentence and print the amount of unique punctuation marks
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class UniquePunctuationMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //User Input
        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();

        //List of values
        String[] listOfPunctuation = {",", "?", "!", ";", ":", "-"};
        Set<Character> set_of_unique_punctuation = new HashSet<>();

        //Compare the sentence to the list of punctuation
        for (int i = 0; i < sentence.length(); i++) {
            for (int j = 0; j < listOfPunctuation.length; j++) {
                if (sentence.charAt(i) == listOfPunctuation[j].charAt(0)) {
                    //If punctuation is detected, add it to the set
                    set_of_unique_punctuation.add(sentence.charAt(i));
                }
            }
        }
        //Output results
        System.out.println("There are: " + set_of_unique_punctuation.size() + " different types of punctuation.");
    }
}
