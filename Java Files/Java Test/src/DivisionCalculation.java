/*
    Jonathan Graydon
    Division Calculator
    This program will take in two values, divide them and round to the nearest hundredth
 */

import java.util.Scanner;

public class DivisionCalculation {
    public static void main(String[]args){
        Scanner sn = new Scanner(System.in);

        double num1 = 0.0;
        double num2 = 0.0;
        double solution = 0.0;

        System.out.println("Enter the first number: "); num1 = sn.nextDouble();
        System.out.println("Enter the second number: "); num2 = sn.nextDouble();

        solution = (num1 / num2); double rounded = Math.round(solution * 100.0) / 100.0;
        System.out.println("The solution is: " + rounded);
    }
}
