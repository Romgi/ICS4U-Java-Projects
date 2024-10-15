/*
 * Test of GUI in Java
 * This program will use the javax.swing library to make a basic UI
 */

import javax.swing.JOptionPane;

public class JavaGUITest {
    public static void main(String[]args){
        String answer = "123";
        String userAnswer = JOptionPane.showInputDialog("Enter: 123");
        if (answer.equals(userAnswer)){
            JOptionPane.showMessageDialog(null, "Correct!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect.");
        }
    }
    
}
