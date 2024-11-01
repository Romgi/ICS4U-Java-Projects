/*
 * Jonathan Graydon
 * Range of an Array
 * This program will read 10 values from the user and print the range of the array
 */

 import java.util.Scanner;

public class RangeOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Initialization
        int[] values = new int[10];
        int maximum = 0;
        int minimum = 0;

        System.out.println("Enter 10 values");
        for (int i = 0; i < 10; i++){
            values[i] = sc.nextInt();
            if(values[i] > maximum){ //If value is greater than the current maximum, the maximum becomes the current value
                maximum = values[i];
            }
            else if(values[i] < minimum){ //If value is less than the curring minimum, the minimum becomes the current value
                minimum = values[i];
            }
        }
        int range = maximum - minimum; //Calculate range
        System.out.println("The range is: " + range); //Prints range
    }
}
