/*Jonathan Graydon
 * Multiplication Table
 * This program will print a multiplication table based on the users inputs
 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting value: ");
        int a = sc.nextInt();
        System.out.println("Enter the end value: ");
        int b = sc.nextInt();
        System.out.println("Enter the multiplier: ");
        double n = sc.nextDouble();

        for (int i = a; i <= b; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
