/*
 * Jonathan Graydon
 * Fraction Simplifier
 * This program will simplify a fraction after the user enters the numerator and denominator
 */

 import java.util.Scanner;

public class FractionSimplifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numerator: "); int numerator = sc.nextInt();
        System.out.println("Enter the denominator: "); int denominator = sc.nextInt();

        int gcf = calculateGCF(numerator, denominator);

    }
    public static int calculateGCF(int num1, int num2){
        int gcf = 0;
        for(int i = 1; i <= num1 && i <= num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcf = i;
            }
        }
        return gcf;
    }
    public static String reduceFraction(int gcf, int numerator, int denominator){
        String reducedFraction = "";

        if(numerator > denominator){
            int mixedFraction = numerator % denominator;

        }
        reducedFraction = (numerator / gcf) + " / " + (denominator / gcf);

        return reducedFraction;
    }
}
