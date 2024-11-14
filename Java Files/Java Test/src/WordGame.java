/*
 * Jonathan Graydon
 * Word Game
 * This program will ask the user to enter a single letter
 * Then the user must enter as many 5 letter words as they can that begin with that letter
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class WordGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //User Input
        System.out.println("Enter the starting letter: ");
        String startLetter = sc.nextLine().toLowerCase();
        if (startLetter.length() != 1) {
            System.out.println("Please enter a single letter.");
            return;
        }

        //Values
        String inputWord = "";
        Set<String> set_of_words = new HashSet<>();

        //Game Loop
        while (!inputWord.equals("quit")) {
            System.out.println("Enter a 5 letter word that starts with: " + startLetter + " or 'quit' to exit: ");
            inputWord = sc.nextLine().toLowerCase();

            //Word must be 5 characters and start with the starting letter
            if (inputWord.length() == 5 && inputWord.charAt(0) == startLetter.charAt(0)) {
                set_of_words.add(inputWord);
            } else if (!inputWord.equals("quit")) {
                System.out.println("Incorrect. Please try again.");
            }
        }

        System.out.println("The number of unique words entered is: " + set_of_words.size());
    }
}
