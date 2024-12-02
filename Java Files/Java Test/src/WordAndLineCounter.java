/*
 * Jonathan Graydon
 * Word & Line Counter
 * This program will count the total number of words and lines in a text file specified by the user
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordAndLineCounter {
public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of a text file: ");
        String nameOfFile = sc.nextLine();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\342502358\\Documents\\GitHub\\ICS4U-Java-Projects\\Java Files\\Java Test\\src\\TextFiles\\" + nameOfFile + ".txt"));

        System.out.println("Enter the line number to view: ");
        int lineNumber = sc.nextInt();

        for(int i = 0; i < lineNumber - 1; i++){
            reader.readLine();
        }

        String outputLine = reader.readLine();
        System.out.println("The line is: " + outputLine);
    }
}
