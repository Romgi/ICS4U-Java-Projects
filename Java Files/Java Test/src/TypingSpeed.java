/* Jonathan Graydon
 * Typing Speed
 * This program will measure the typing speed of the user
*/

import java.util.Scanner;

public class TypingSpeed{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //Phrases to be asked
        String phrase1 = "This sentence is used to calculate how fast the user can type. The result will be calculated using java's currentTime function";
        String phrase2 = "This is the second sentence that will also be used to calculate your typing speed. Type this as fast as you can";
        String phrase3 = "This is your final typing test phrase, almost there keep typing";
        
        //First phrase
        System.out.println("Please enter the following text as fast as you can: ");
        System.out.println(phrase1);

        //Calculate time it took to input
        long startTime1 = System.currentTimeMillis();
        String input1 = sc.nextLine();
        long endTime1 = System.currentTimeMillis();
        long typeTime1 = (endTime1-startTime1) / 1000;

        //Check if typed correctly
        if(input1.equals(phrase1)){
            System.out.println("Wow, you typed that correctly in: " + typeTime1 + " seconds!");
        }
        else{
            System.out.println("Invalid, you did not type the sentence correctly.");
        }


        //Second phrase
        System.out.println("Please enter the following text as fast as you can: ");
        System.out.println(phrase2);

        //Calculate the time it took to input
        long startTime2 = System.currentTimeMillis();
        String input2 = sc.nextLine();
        long endTime2 = System.currentTimeMillis();
        long typeTime2 = (endTime2-startTime2) / 1000;

        //Check if typed correctly
        if(input2.equals(phrase2)){
            System.out.println("Wow, you typed that correctly in: " + typeTime2 + " seconds!");
        }
        else{
            System.out.println("Invalid, you did not type the sentence correctly.");
        }


        //Third phrase
        System.out.println("Please enter the following text as fast as you can: ");
        System.out.println(phrase3);

        //Calculate the time it took to input
        long startTime3 = System.currentTimeMillis();
        String input3 = sc.nextLine();
        long endTime3 = System.currentTimeMillis();
        long typeTime3 = (endTime3-startTime3) / 1000;

        //Check if typed correctly
        if(input3.equals(phrase3)){
            System.out.println("Wow, you typed that correctly in: " + typeTime3 + " seconds!");
        }
        else{
            System.out.println("Invalid, you did not type the sentence correctly.");
        }        
    }
}