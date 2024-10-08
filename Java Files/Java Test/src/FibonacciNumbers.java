/*
 * Jonathan Graydon
 * Fibonacci Numbers
 * This program will calculate a specified amount of fibonacci numbers
 */

 import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int previousNumber = 1;
        int currentNumber = 1;

        System.out.println("Enter the amount of numbers to generate: "); int amountOfNumbers = sc.nextInt(); //User input for number of cycles

        //For loop to run fibonacci logic
        for (int i = 0; i <= amountOfNumbers; i++){
            System.out.println(currentNumber);

            currentNumber = currentNumber + previousNumber;
            previousNumber = currentNumber - previousNumber;
        }

    }
}
