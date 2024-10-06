/*Jonathan Graydon
 * Collatz Conjecture Simulator
 * This program will simulate the unsolved collatz conjecture math problem
 */

 import java.util.Scanner;

public class CollatzConjectureSimulator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting value: ");
        int currentNumber = sc.nextInt();

        while (currentNumber != 1){
            if ((currentNumber % 2) == 0){
                currentNumber /= 2;
            }
            else{
                currentNumber = (currentNumber * 3) + 1;
            }
            System.out.println(currentNumber);
        }
    }
}
