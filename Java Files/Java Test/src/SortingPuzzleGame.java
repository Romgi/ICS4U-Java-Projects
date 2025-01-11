/*
 * Jonathan Graydon
 * Sorting Puzzle Game
 * This program will play a game with the user where a list of numbers must be sorted from least to greatest
 * The user can only swap two numbers at a time, number of swaps and time is tracked
 */

 import java.util.*;

 public class SortingPuzzleGame {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
 
         //Initialize stuff here
         int[] array = random.ints(10, 1, 101).toArray();
         int[] previousArray = array.clone();
         int swaps = 0;
         long startTime = System.currentTimeMillis();
 
         System.out.println("Welcome to the Sorting Puzzle!");
 
         //Main loop for the game
         while (true) {
             System.out.println("Current array: " + Arrays.toString(array));
             System.out.println("Enter 'S' to swap, 'U' to undo last swap, or 'D' to declare sorted:");
             String choice = scanner.nextLine().trim().toUpperCase();
 
             //If the user wants to switch two numbers
             if (choice.equals("S")) {
                 System.out.println("Enter two indices to swap (0-9):");
                 int i = scanner.nextInt();
                 int j = scanner.nextInt();
                 scanner.nextLine();
 
                 if (i >= 0 && i < 10 && j >= 0 && j < 10) {
                     previousArray = array.clone(); //Clones the array so the user can undo it if they want
                     int temp = array[i];
                     array[i] = array[j];
                     array[j] = temp;
                     swaps++;
                 } else {
                     System.out.println("Invalid indices. Try again.");
                 }
                 //Undo the change
             } else if (choice.equals("U")) {
                 array = previousArray.clone();
                 System.out.println("Undo successful. Last swap reverted.");
             } else if (choice.equals("D")) {
                 if (isSorted(array)) {
                     long endTime = System.currentTimeMillis(); // End timer
                     long elapsedTime = (endTime - startTime) / 1000; // Calculate elapsed time in seconds instead of miliseconds
                     System.out.println("Congratulations! You sorted the array in " + swaps + " swaps.");
                     System.out.println("Time taken: " + elapsedTime + " seconds.");
                     break;
                 } else {
                     System.out.println("The array is not sorted. Game Over.");
                     break;
                 }
             } else {
                 System.out.println("Invalid choice. Try again.");
             }
         }
     }
 
     //Checks if sorted and returns result
     private static boolean isSorted(int[] array) {
         for (int i = 0; i < array.length - 1; i++) {
             if (array[i] > array[i + 1]) {
                 return false;
             }
         }
         return true;
     }
 }