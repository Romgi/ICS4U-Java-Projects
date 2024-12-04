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
     public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);
 
         System.out.println("Enter the name of a text file: ");
         String nameOfFile = sc.nextLine();
         BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\342502358\\Documents\\GitHub\\ICS4U-Java-Projects\\Java Files\\Java Test\\src\\TextFiles\\" + nameOfFile + ".txt"));
 
         int numWords = 0;
         int numLines = 0;
 
         for (String curr_line = reader.readLine(); curr_line != null; curr_line = reader.readLine()) {
             numLines++;
             String[] words = curr_line.trim().split("\\s+");
 
             numWords += curr_line.split("\\s").length;
         }
 
         System.out.println("The number of words is: " + numWords);
         System.out.println("The number of lines is: " + numLines);
     }
 }
 