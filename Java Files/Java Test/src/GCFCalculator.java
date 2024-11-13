/*
 * Jonathan Graydon
 * GCF Calculator
 * This program will take in two integer inputs, and return the GCF
 */

public class GCFCalculator {
    public static void main(String[] args) {

        int num1 = 16;
        int num2 = 32;
        System.out.println("The gcf is: " + calculateGCf(num1, num2));

        num2 = 162;
        num1 = 263;
        System.out.println("The gcf is: " + calculateGCf(num1, num2));

    }

    public static Integer calculateGCf(int num1, int num2){
        int gcf = 0;
        for(int i = 1; i <= num1 && i <= num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcf = i;
            }
        }
        return gcf;
    }
}
