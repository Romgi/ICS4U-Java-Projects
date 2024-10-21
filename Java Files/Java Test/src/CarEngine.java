/*
 * Jonathan Graydon
 * Car Engine Program
 * This program will display information about your car's engine
 */

import javax.swing.JOptionPane;

public class CarEngine {
    public static void main(String[]args){
        String engineType = JOptionPane.showInputDialog("Enter your car's engine type: (Gasoline [1], Diesel [2], Electric [3], Hybrid [4], Hydrogen [5]) ");
        int engineTypeCase = Integer.parseInt(engineType);
        System.out.println(engineTypeCase);

        switch (engineTypeCase){
            default:
            JOptionPane.showMessageDialog(null, "Invalid input, please enter a number from 1-5"); break;
            case 1:
            JOptionPane.showMessageDialog(null, "Description: Standard gasoline engine with moderate fuel efficiency."); break;
            case 2:
            JOptionPane.showMessageDialog(null, "Description: Diesel engine with higher torque, often used for trucks and heavy-duty vehicles."); break;
            case 3:
            JOptionPane.showMessageDialog(null, "Description: Fully electric engine, no emissions, high efficiency."); break;
            case 4:
            JOptionPane.showMessageDialog(null, "Description: Combination of gasoline and electric, improved fuel efficiency."); break;
            case 5: 
            JOptionPane.showMessageDialog(null, "Description: Hydrogen fuel cell engine, zero emissions, still experimental."); break;
            
        }
    }
}
