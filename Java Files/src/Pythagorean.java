/*
 Jonathan Graydon
 Pythagorean theorem
 This program will calculate the hypotenuse based on two inputted side lengths
 */

import java.util.Scanner;

public class Pythagorean{
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        double side1 = 0.0;
        double side2 = 0.0;
        double hypotenuse = 0.0;

        System.out.println("Enter the length of side1: "); side1 = sn.nextDouble();
        System.out.println("Enter the length of side1: "); side2 = sn.nextDouble();

        hypotenuse = Math.sqrt(Math.sqrt(side1) + Math.sqrt(side2));
        System.out.println("The hypotenuse is: " + hypotenuse);
    }
}