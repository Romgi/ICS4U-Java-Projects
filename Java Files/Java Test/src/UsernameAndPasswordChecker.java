/* Jonathan Graydon
    Username and passoword checker
    This program will output if a password and username match the one in the code
    Username: username
    Password: password
    Case sensitive
 */

import java.util.Scanner;

public class UsernameAndPasswordChecker {
    public static void main(String[]args){
        Scanner sn = new Scanner(System.in);

        //Handling initial username and password variables
        String username = "username";
        String password = "password";

        String enteredUsername = "";
        String enteredPassword = "";

        //User inputs
        System.out.println("Enter username: "); enteredUsername = sn.nextLine();
        System.out.println("Enter password: "); enteredPassword = sn.nextLine();

        //Detect if enters credentials match stored ones
        if(enteredUsername.equals(username) && (enteredPassword.equals(password))){
            System.out.println("Logging in...");
            System.out.println("Sucessfully logged in!");
        }
        else{
            System.out.println("Invalid Username or Password.");
        }
    }
}
