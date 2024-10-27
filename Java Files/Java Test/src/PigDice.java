/*
 * Jonathan Graydon
 * Pig Dice Game
 * This program will play the pig dice game with the user
 */

 import java.util.Scanner;

 public class PigDice {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         // Variable Initialization
         int winningScore = 30;
         String player1Name = "Player1";
         String player2Name = "Player2";
 
         int player1Score = 0;
         int player2Score = 0;
         int turnScore = 0;
         int diceRoll = 0;
 
         // Start the game by asking users to input their names and winning score
         System.out.println("Welcome to the Pig Dice Game! \nTo play, each player must first enter their name and decide on the winning score.");
 
         System.out.print("Player 1, enter your name: "); //Player 1 input with error check
         player1Name = sc.nextLine();
         if (player1Name.isEmpty()) {
             player1Name = "Player1"; //Set to default value if no username is inputted
             System.out.println("No name inputted. Player 1 name set to default.");
         }
 
         System.out.print("Player 2, enter your name: "); //Player 1 input with error check
         player2Name = sc.nextLine();
         if (player2Name.isEmpty()) {
             player2Name = "Player2"; //Set to default value if no username is inputted
             System.out.println("No name inputted. Player 2 name set to default.");
         }
 
         System.out.print("Enter winning score: "); //Initialize winning score
         if (sc.hasNextInt()) { //if the scanner gets an integer input
             winningScore = sc.nextInt();
             if (winningScore <= 0) {
                 System.out.println("Winning score must be positive. Default set to 30."); //Error if winning score is negative or zero
                 winningScore = 30;
             }
         } 
         else {
             System.out.println("Invalid input. Winning score set to default (30)."); //Extra error code
             winningScore = 30;
             sc.next();
         }
 
         //Start game
         System.out.println("The game will begin shortly...");
         try { Thread.sleep(2000); } catch (InterruptedException e) {}
 

         /*
          * Main game loop
            This part will loop through the following code under the following conditions:
            while a player has not yet won the game,
            The ? : operators decide who's turn it is
            And it sets the current score to whoevers turn it is
          */
         boolean isPlayer1Turn = true;
         while (player1Score < winningScore && player2Score < winningScore) {
             String currentPlayer = isPlayer1Turn ? player1Name : player2Name;
             int currentScore = isPlayer1Turn ? player1Score : player2Score;
             turnScore = 0;
 
             System.out.println("\n" + currentPlayer + "'s turn:");
             boolean turnActive = true;
             while (turnActive) { 
                 System.out.print("Roll or Hold? [r][h]: "); //Ask the user what move they want to make
                 char choice = sc.next().toLowerCase().charAt(0); //Code to make inputting a single character to save time
                 if (choice == 'r') { //Player rolls the dice
                     diceRoll = (int) (Math.random() * 6) + 1;
                     System.out.println("You rolled a: " + diceRoll);
 
                     if (diceRoll == 1) { //Reset points for this round if a one is rolled
                         System.out.println("Rolled a 1! No points this turn.");
                         turnScore = 0;
                         turnActive = false; //Next turn
                     } else {
                         turnScore += diceRoll; //Add total points this round
                         System.out.println("Current turn score: " + turnScore + " | Total score if held: " + (currentScore + turnScore));
                     }
                 } else if (choice == 'h') { //Player decides to hold
                     if (isPlayer1Turn) { //Checks which players turn it is and adds the current ammount of points to their total
                         player1Score += turnScore;
                     } else {
                         player2Score += turnScore;
                     }
                     System.out.println(currentPlayer + "'s total score: " + (isPlayer1Turn ? player1Score : player2Score)); //? finds whos turn it is and prints their total score
                     turnActive = false;
                 } else {
                     System.out.println("Invalid choice. Please enter 'r' to roll or 'h' to hold."); //Error if move is invalid
                 }
             }
 
             // Check if the game is over, checks if player 1 or 2 has won
             if (player1Score >= winningScore) {
                 System.out.println("\n" + player1Name + " wins with a score of " + player1Score + "!"); //Player1 wins
                 break;
             } else if (player2Score >= winningScore) {
                 System.out.println("\n" + player2Name + " wins with a score of " + player2Score + "!"); //Player2 wins
                 break;
             }
 
             // Switch turn to the other player
             isPlayer1Turn = !isPlayer1Turn;
         }
     }
 }
 