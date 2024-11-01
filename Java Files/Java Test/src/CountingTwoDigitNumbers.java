/*
 * Jonathan Graydon
 * Counting Two-Digit Numbers
 * This program will count the number of two digit numbers in an array
 */

public class CountingTwoDigitNumbers {
   public static void main(String[] args) {
    int[] values = {1, 7, 8, 4, 6, 20, 6, 7, 10, 11, 12};
        
    int twoDigitNums = 0;
    // Loop through every single element in the array
    for (int i = 0; i < values.length; i++) {

        if (String.valueOf(values[i]).length() == 2) {
            twoDigitNums++;
        }
    }

    System.out.println("There are " + twoDigitNums + " two digit numbers.");
   } 
}
