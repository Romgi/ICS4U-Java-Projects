/*
    Jonathan Graydon
    Email Analyzer
    This program will separate an email address into a username and a domain
 */

import java.util.Scanner;

public class EmailAnalyzer {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter your email: "); String email = sn.nextLine();
        int atIndex = email.indexOf('@');
        String name = email.substring(0, atIndex);
        int endIndex = email.length();
        String domain = email.substring(atIndex,endIndex);
        System.out.println("The Name is: " + name);
        System.out.println("The domain is: " + domain);
    }
}
