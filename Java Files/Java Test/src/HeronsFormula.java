/*
 * Jonathan Graydon
 * Heron's Formula
 * This program will calculate the area of a triangle using heron's formula
 */

import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Test Cases
        double side1 = 10;
        double side2 = 10;
        double side3 = 10;
        System.out.println("The area is: " + calculateArea(side1, side2, side3));

        side1 = 1;
        side2 = 1;
        side3 = 1;
        System.out.println("The area is: " + calculateArea(side1, side2, side3));

        side1 = 100;
        side2 = 100;
        side3 = 1;
        System.out.println("The area is: " + calculateArea(side1, side2, side3));


        //User inputs
        System.out.println("Enter the length of side1: "); side1 = sc.nextDouble();
        System.out.println("Enter the length of side2: "); side2 = sc.nextDouble();
        System.out.println("Enter the length of side3: "); side3 = sc.nextDouble();

        //Print result using calculateArea method
        System.out.println("The area is: " + calculateArea(side1, side2, side3));

    }

    public static Double calculateArea(double a, double b, double c){
        //Find the semi-perimeter
        double s = (a + b + c)/2;

        //Find the area using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}
