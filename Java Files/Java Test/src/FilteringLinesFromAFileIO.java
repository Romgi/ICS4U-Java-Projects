/*
 * Jonathan Graydon
 * Filtering Lines From A File Using File IO
 * This program will ask the user to enter a file, keyword, and output file
 * The program will then write the lines that contain the keyword
 */

import java.io.*;
import java.util.Scanner;

public class FilteringLinesFromAFileIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt the user for the necessary inputs
        System.out.print("Enter the name of the input file: ");
        String inputFileName = scanner.nextLine();

        System.out.print("Enter the keyword to search for: ");
        String keyword = scanner.nextLine();

        System.out.print("Enter the name of the output file: ");
        String outputFileName = scanner.nextLine();

        //Good practice to use try-with-resources
        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))
        ) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                // Check if the line contains the keyword
                if (line.contains(keyword)) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            
            //Tells the user that something Happened
            System.out.println("Lines containing \"" + keyword + "\" have been written to " + outputFileName + ".");
        } 
        catch (FileNotFoundException e) {
            System.err.println("Input file not found: " + inputFileName);
        }
        catch (IOException e) {
            System.err.println("Error reading/writing files: " + e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}
