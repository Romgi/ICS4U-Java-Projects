/*Jonathan Graydon
 * Certificates of Deposit
 * This program will calculate the number of years required for a CD to be worth a specified ending value
 */

import java.util.Scanner;

public class CertificatesOfDeposit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the initial investment: ");
        double value = sc.nextDouble();
        System.out.println("Enter the annual interest rate: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the desired ending value: ");
        double endValue = sc.nextDouble();

        double years = 0.0;

       while(value <= endValue){
        value = value + (value * rate);
        years ++;
       }
       System.out.println("It will take: " + years + " years to reach the end value.");
       
    }
}
