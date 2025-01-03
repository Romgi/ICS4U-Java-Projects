/*
 * Jonathan Graydon
 * Classifying Curricanes
 * This program will use a switch statement to display the wind speed of a hurricane based on its category
 */

import javax.swing.JOptionPane;

public class ClassifyingHurricanes {
    public static void main(String[]args){

        String cat = JOptionPane.showInputDialog(null, "Enter the category of the hurricane: ");
        int category = Integer.parseInt(cat);

        switch(category){
            default:
                JOptionPane.showMessageDialog(null, "Error: Please enter a number from 1-5", null, 0); break;
            case 1: 
                JOptionPane.showMessageDialog(null, "Winds: 74-95 mph or 64-82 kt or 119-153 km/hr", null, 1); break;
            case 2:
                JOptionPane.showMessageDialog(null, "Winds: 96-110 mph or 83-95 kt or 154-177 km/hr", null, 1); break;
            case 3:
                JOptionPane.showMessageDialog(null, "Winds: 111-130 mph or 96-113 kt or 178-209 km/hr", null, 1); break;
            case 4:
                JOptionPane.showMessageDialog(null, "Winds: 131-155 mph or 114-135 kt or 210-249 km/hr", null, 1); break;
            case 5:
                JOptionPane.showMessageDialog(null, "Winds: greater than 155 mph or 135 kt or 249 km/hr", null, 1); break;
        }
        
    }
}
