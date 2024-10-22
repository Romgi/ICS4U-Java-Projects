/*
 * Jonathan Graydon
 * Email Analyzer with Error Checking
 * This program will separate the name and domain of an email with error checks included
 */

import java.util.Scanner;

public class EmailAnalyzerErrorChecking {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter your email: "); String email = sn.nextLine();

        if (!(email.isEmpty())){
            if (email.contains("@")){
                analyzeEmail(email);
            }
            else{
                System.out.println("The email inputted does not include a domain folling an '@' symbol");
            }
        }
        else{
            System.out.println("The email cannot be empty");
        }
    }

    private static void analyzeEmail(String email){
        int atIndex = email.indexOf('@');
        String name = email.substring(0, atIndex);
        int endIndex = email.length();
        String domain = email.substring(atIndex,endIndex);
        System.out.println("The Name is: " + name);
        System.out.println("The domain is: " + domain);
    }
}
