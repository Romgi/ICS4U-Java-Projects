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

        int[] array = random.ints(10, 1, 101).toArray();
        int swaps = 0;

        System.out.println("Welcome to the Sorting Puzzle!");

        while (true) {
            System.out.println("Current array: " + Arrays.toString(array));
            System.out.println("Enter 'S' to swap or 'D' to declare sorted:");
            String choice = scanner.nextLine().trim().toUpperCase();

            if (choice.equals("S")) {
                System.out.println("Enter two indices to swap (0-9):");
                int i = scanner.nextInt();
                int j = scanner.nextInt();
                scanner.nextLine();

                if (i >= 0 && i < 10 && j >= 0 && j < 10) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    swaps++;
                } else {
                    System.out.println("Invalid indices. Try again.");
                }
            } else if (choice.equals("D")) {
                if (isSorted(array)) {
                    System.out.println("Congratulations! You sorted the array in " + swaps + " swaps.");
                    break;
                } else {
                    System.out.println("The array is not sorted. Game Over.");
                    break;
                }
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
