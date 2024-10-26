/*
 * Jonathan Graydon
 * Pig Dice Game
 * This program will play the pig dice game with the user
 */

 import javax.swing.JOptionPane;

public class PigDice {
    public static void main(String[] args) {

        //Variable Initialization
        //All variables will be set to a default value before they are customized
        int winningScore = 30;
        String player1Name = "Player1";
        String player2Name = "Player2";


        //Start the game by asking users to input their names
        JOptionPane.showMessageDialog(null, "Welcome to the pig dice game! \n To play, each player must first enter their name and decide on the winning score.");
        player1Name = JOptionPane.showInputDialog("Player1, enter your name: ");
        if(player1Name.equals("")){ //makes sure user enters a valid name or else it will be set to default
            player1Name = "Player1";
            JOptionPane.showMessageDialog(null, "No name inputted. Player1 name set to default.");
        }
        else{
        JOptionPane.showMessageDialog(null, "Player1 name set to: " + player1Name);
        }
        player2Name = JOptionPane.showInputDialog("Player2, enter your name: ");
        if(player2Name.equals("")){ //makes sure user enters a valid name or else it will be set to default
            player2Name = "Player2";
            JOptionPane.showMessageDialog(null, "No name inputted. Player2 name set to default.");
        }
        else{
        JOptionPane.showMessageDialog(null, "Player2 name set to: " + player2Name);
        }
        winningScore = Integer.parseInt(JOptionPane.showInputDialog("Enter the winning score: "));
        if((winningScore % 1) != 0){
            JOptionPane.showMessageDialog(null, "Winning score must be an integer Winning score set to default (30)");
            winningScore = 30;
        }
        else{
            JOptionPane.showMessageDialog(null, "Winning score set to: " + winningScore);
        }
    }
}
