/*
 * Jonathan Graydon
 * Fraction Simplifier
 * This program will simplify a fraction after the user enters the numerator and denominator
 */

import java.util.Scanner;

public class FractionSimplifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = sc.nextInt();

        if (denominator == 0) {
            System.out.println("Error: Division by zero is undefined. Please enter a valid denominator.");
            return;
        }

        int gcf = calculateGCF(numerator, denominator);
        String simplifiedFraction = reduceFraction(gcf, numerator, denominator);
        System.out.println("The simplified fraction is: " + simplifiedFraction);
    }

    public static int calculateGCF(int num1, int num2) {
        num1 = Math.abs(num1); // To handle negative values
        num2 = Math.abs(num2);
        int gcf = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcf = i;
            }
        }
        return gcf;
    }

    public static String reduceFraction(int gcf, int numerator, int denominator) {
        numerator /= gcf;
        denominator /= gcf;

        if (numerator > denominator) {
            // Handle mixed fractions
            int wholeNumber = numerator / denominator;
            int remainder = numerator % denominator;
            if (remainder == 0) {
                return String.valueOf(wholeNumber); // Return as a whole number if no remainder
            } else {
                return wholeNumber + " " + remainder + " / " + denominator; // Return mixed fraction
            }
        } else {
            return numerator + " / " + denominator; // Return proper fraction
        }
    }
}
