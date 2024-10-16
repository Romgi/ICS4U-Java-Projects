/*
 * Jonathan Graydon
 * Summing User Inputs GUI
 * This program will ask the user to enter numbers until they they type quit, then it will print the sum]
  */

  import javax.swing.JOptionPane;

public class SummingUserInputsGUI {
    public static void main(String[]args){
        int total = 0;
        String userInput = "";

        while(userInput.toLowerCase() != "quit"){
            userInput = JOptionPane.showInputDialog("Enter number or 'quit' to calculate total: ");
            if(!userInput.toLowerCase().equals("quit")){
                int num = Integer.parseInt(userInput);
                total += num;
            }
            else{
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "The total is: " + total);
        
    }
}
