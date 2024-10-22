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
            System.out.println("Enter grade 1: "); int grade1 = sc.nextInt(); if(grade1 < 0 || grade1 > 100){isError = true; break;}
            System.out.println("Enter grade 2: "); int grade2 = sc.nextInt(); if(grade2 < 0 || grade1 > 100){isError = true; break;}
            System.out.println("Enter grade 3: "); int grade3 = sc.nextInt(); if(grade3 < 0 || grade1 > 100){isError = true; break;}
            System.out.println("Enter grade 4: "); int grade4 = sc.nextInt(); if(grade4 < 0 || grade1 > 100){isError = true; break;}

            int average = (grade1 + grade2 + grade3 + grade4) /4;
            System.out.println("The average is: " + average);
            break;
        }

        if(!isError){
            System.out.println("Enter a value between 0 and 100");
        }


    }
}
