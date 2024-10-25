/*Jonathan Graydon
 * Average Calculator with Error Checking
 * This program will calculate the average of 4 percentage grades with error handling
 */

import java.util.Scanner;

public class AverageCalculatorErrorChecking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean isError = false;

        while(!isError){
            System.out.println("Enter grade 1: "); double grade1 = sc.nextDouble(); if(grade1 < 0 || grade1 > 100){isError = true; break;}
            System.out.println("Enter grade 2: "); double grade2 = sc.nextDouble(); if(grade2 < 0 || grade2 > 100){isError = true; break;}
            System.out.println("Enter grade 3: "); double grade3 = sc.nextDouble(); if(grade3 < 0 || grade3 > 100){isError = true; break;}
            System.out.println("Enter grade 4: "); double grade4 = sc.nextDouble(); if(grade4 < 0 || grade4 > 100){isError = true; break;}

            double average = (grade1 + grade2 + grade3 + grade4) /4;
            System.out.println("The average is: " + average + "%");
            break;
        }

        if(isError){
            System.out.println("Enter a numeric value between 0 and 100");
        }


    }
}
