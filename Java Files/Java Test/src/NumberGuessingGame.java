/* Jonathan Graydon
    Number guessing game
 *  This program will generate a random number and will make you guess it
 *  The program will tell you if your guess is too high or too low
 */

import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Picking a random number between 1 and 30...");
        // Generate random number in the range 1-30
        int randomNumber = 1 + (int)(Math.random() * (30 - 1));
        int numGuesses = 0;
        
        boolean guessedCorrectly = false;
        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            Scanner sc = new Scanner(System.in);
            int userGuess = sc.nextInt();
            numGuesses++;
            
            if (userGuess == randomNumber) {
                System.out.println("You guessed right!");
                System.out.println("It took you: " + numGuesses + " guesses!");
                guessedCorrectly = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess was too low. Try again.");
            } else {
                System.out.println("Your guess was too high. Try again.");
            }
        }
    }
}