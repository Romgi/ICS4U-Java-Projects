/*
 * Jonathan Graydon
 * Unique Punctuation Marks in a Sentence
 * This program will take in a sentence and print the amount of unique punctuation marks
 */

 import java.util.Scanner;
 import java.util.Set;
 import java.util.HashSet;

public class UniquePunctuationMarks {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();

        String[] listOfPunctuation = {",", "?", "!", ";", ":", "-"};

        Set<Character> set_of_unique_punctuation = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++){
            for (int j = 0; j < listOfPunctuation.length; i++){
                if (sentence.substring(i, i).equals(listOfPunctuation[j])){
                    set_of_unique_punctuation.add(sentence.charAt(i));
                }
            }
        }
        System.out.println("There are: " + set_of_unique_punctuation.size() + "different types of punctuation.");
    }
}
