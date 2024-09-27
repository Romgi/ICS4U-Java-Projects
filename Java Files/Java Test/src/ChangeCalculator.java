/* Jonathan Graydon
    Change Calculator
    This program will calculate the least amount of coins needed to get a certain change
 */

import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[]args){
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the number of change: ");
        int change = sn.nextInt();

        int numberOfQuarters = change /25; change -= numberOfQuarters * 25;
        int numberOfDimes = change /10; change -= numberOfDimes * 10;
        int numberOfNickels = change /5; change -= numberOfNickels * 5;
        int numberOfPennies = change /5; change -= numberOfPennies;

        System.out.println("The number of coins is: ");
        System.out.println("Quarters: " + numberOfQuarters);
        System.out.println("Dimes: " + numberOfDimes);
        System.out.println("Nickels: " + numberOfNickels);
        System.out.println("Pennies: " + numberOfPennies);
    }
}
