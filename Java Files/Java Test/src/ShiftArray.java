/*
 * Jonathan Graydon
 * Shifting An Array
 * This program will shift an array by 3 spaces down
 */

import java.util.Scanner;

public class ShiftArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[8];

        System.out.println("Enter 8 numbers:"); //Input 8 numbers
        for (int i = 0; i < 8; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter number of spaces to shift: ");
        int shift = sc.nextInt(); //Creates a new array with the shifted values
        int[] array = new int[8];
        for (int i = 0; i < 8; i++) { //Goes through array and sets all the shifted numbers
            array[(i + shift) % 8] = numbers[i];
        }
        System.out.println("Shifted Array:");
        for (int value : array) { //Outputs the shifted array
            System.out.println(value);
        }
    }
}