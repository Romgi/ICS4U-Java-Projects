/*Jonathan Graydon
 * Count Digits
 * This program will count the amount of digits in a sentence
 */ 

import java.util.Scanner;

public class CountDigits {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence: "); String sentence = sc.nextLine();
        int lengthofString = sentence.length();
        int numdigits = 0;

        for (int i = 0; i < lengthofString; i++){
            if((Character.isDigit(sentence.charAt(i)))){
                numdigits++;
            }
        }
        System.out.println("Number of digits: " + numdigits);

    }
}
