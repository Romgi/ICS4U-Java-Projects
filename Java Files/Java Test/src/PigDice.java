/*
 * Jonathan Graydon
 * Pig Dice Game
 * This program will play the pig dice game with the user
 */

import java.util.Scanner;

public class PigDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variable Initialization
        //All variables will be set to a default value before they are customized

        int winningScore = 30;
        String player1Name = "Player1";
        String player2Name = "Player2";

        int currentTurn = 1;
        int turnScore = 0;

        Boolean gameRunning = false;

        //Start the game by asking users to input their names
        System.out.println("Welcome to the pig dice game! \n To play, each player must first enter their name and decide on the winning score.");

        System.out.println("Player1 enter your name: "); player1Name = sc.nextLine();
        if(player1Name.equals("")){ //makes sure user enters a valid name or else it will be set to default
            player1Name = "Player1";
            System.out.println("No name inputted. Player1 name set to default.");
        }
        else{
        System.out.println("Player1 name set to: " + player1Name);
        }
        System.out.println("Player2 enter your name: "); player2Name = sc.nextLine();
        if(player2Name.equals("")){ //makes sure user enters a valid name or else it will be set to default
            player1Name = "Player2";
            System.out.println("No name inputted. Player2 name set to default.");
        }
        else{
        System.out.println("Player2 name set to: " + player2Name);
        }
        System.out.println("Enter winning score: ");
        winningScore = sc.nextInt();
        if((winningScore % 1) != 0){
            System.out.println("Error: Winning score must be an integer. Winning score set to default (30)");
            winningScore = 30;
        }
        else{
            System.out.println("Winning score set to: " + winningScore);
        }

        System.out.println("The game will begin shortly...");
        try{Thread.sleep(2000);} catch(InterruptedException e){}

        System.out.println("Game on!");


        while(gameRunning){
            if(currentTurn == 1){
                System.out.println(player1Name + "'s turn: ");
                
                
            }
        }
    }
}
