/*
 * Jonathan Graydon
 * Count Non-Alphanumeric
 * This program will count the number of non-alphanumeric characters in a sentence.
 */

import java.util.Scanner;

public class CountNonAlpha {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        int numNonAlpha = 0;

        for (int i = 0; i < sentence.length(); i++){
            if(Character.isDigit(sentence.charAt(i)) && (Character.isLetter(sentence.charAt(i)))){
                continue;
            } 
            else{
                numNonAlpha++;
            }
        }
        System.out.println("The number of non-alphanumeric characters is: " + numNonAlpha);
    }
    
}
