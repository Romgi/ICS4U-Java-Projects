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
        int gf1 = 0;
        int gf2 = 0;
        int gcf = 0;

        while (true){
            for (int i = 1; i < num1; i++){
                if(num1 % i == 0){
                    if(i > gf1){
                        gf1 = i;
                    }
                }
            }
            for (int i = 1; i < num2; i++){
                if(num2 % i == 0){
                    if(i > gf2){
                        gf2 = i;
                    }
                }
            }
        }
        return gcf;
    }
}
