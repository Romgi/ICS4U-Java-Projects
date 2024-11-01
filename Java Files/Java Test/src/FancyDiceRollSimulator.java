/*
 * Jonathan Graydon
 * Fancier Dice Roll Simulator
 * This program will keep track of previous dice rolls
 */

 import java.util.Scanner;

public class FancyDiceRollSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initialize number of rolls and create arrays
        System.out.println("Enter the amount of rolls: "); int rolls = sc.nextInt();
        int[] diceRoll = new int[rolls];
        int[] numbers = {0,0,0,0,0,0,0};

        for(int i = 0; i < rolls; i++){ //Loops through amount of rolls
            diceRoll[i] = (int)((6 - 1 + 1) * Math.random() + 1); //Generates random from 1-6
            System.out.println(diceRoll[i]);
            switch (diceRoll[i]) { //Switch to count amount of each number
                case 1:
                    numbers[1]++;
                    break;
                case 2:
                    numbers[2]++;
                    break;
                case 3:
                    numbers[3]++;
                    break;
                case 4:
                    numbers[4]++;
                    break;
                case 5:
                    numbers[5]++;
                    break;
                case 6:
                    numbers[6]++;
                    break;
                default:
                    break;
            }
        }
        for(int i = 1; i <= 6; i++){ //Output the list of each number
            System.out.println("The number of: " + i + "s rolled is: " + numbers[i]);
        }


    }
}
