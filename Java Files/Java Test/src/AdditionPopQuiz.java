/* Jonathan Graydon
    Addition Pop Quiz
    This program will quiz the user on simple addition
 */

import java.util.Scanner;

public class AdditionPopQuiz {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        int randomNumber1 = (int)((20 - 1 + 1) * Math.random() + 1);
        int randomNumber2 = (int)((20 - 1 + 1) * Math.random() + 1);
        int sum = randomNumber1 + randomNumber2;

        System.out.println("What is: " + randomNumber1 + " + " + randomNumber2);
        int userInput = sn.nextInt();

        if(userInput == sum){
            System.out.println("CORRECT!");
        }
        else{
            System.out.println("INCORRECT");
        }

        randomNumber1 = (int)((20 - 1 + 1) * Math.random() + 1);
        randomNumber2 = (int)((20 - 1 + 1) * Math.random() + 1);
        sum = randomNumber1 + randomNumber2;

        System.out.println("What is: " + randomNumber1 + " + " + randomNumber2);
        userInput = sn.nextInt();

        if(userInput == sum){
            System.out.println("CORRECT!");
        }
        else{
            System.out.println("INCORRECT");
        }

        randomNumber1 = (int)((20 - 1 + 1) * Math.random() + 1);
        randomNumber2 = (int)((20 - 1 + 1) * Math.random() + 1);
        sum = randomNumber1 + randomNumber2;

        System.out.println("What is: " + randomNumber1 + " + " + randomNumber2);
        userInput = sn.nextInt();

        if(userInput == sum){
            System.out.println("CORRECT!");
        }
        else{
            System.out.println("INCORRECT");
        }

    }
}
