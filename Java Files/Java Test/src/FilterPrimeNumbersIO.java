/*
 * Jonathan Graydon
 * Filtering Prime Numbers using File I/O
 * This program will read a file containing one integer per line
 * and write the prime numbers into a new file.
 */

 import java.io.*;

 public class FilterPrimeNumbersIO {
     public static void main(String[] args) {
         String inputFileName = "listOfNumbers.txt";
         String outputFileName = "primeNumbers.txt";
         
         // Use try-with-resources to auto-close the streams.
         try (
             BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))
         ) {
             String line;
             while ((line = reader.readLine()) != null) {
                 line = line.trim();
                 if (line.isEmpty()) {
                     continue;
                 }
 
                 int number = Integer.parseInt(line);
 
                 if (isPrimeNumber(number)) {
                     writer.write(Integer.toString(number));
                     writer.newLine();
                 }
             }
             System.out.println("Prime numbers successfully written to " + outputFileName);
         } 

         //Some code for different errors that there might be
         //Uses e.getMessage to output the errors
         catch (FileNotFoundException e) {
             System.err.println("File " + inputFileName + " not found.");
         } 
         catch (IOException e) {
             System.err.println("I/O error: " + e.getMessage());
         }
         catch (NumberFormatException e) {
             System.err.println("Invalid integer in file: " + e.getMessage());
         }
     }
 
     /**
      * Checks if an integer 'num' is prime.
      * Returns true if prime, false otherwise.
      */
     public static boolean isPrimeNumber(int num) {
         if (num < 2) {
             return false;
         }
         int sqrt = (int) Math.sqrt(num);
         for (int i = 2; i <= sqrt; i++) {
             if (num % i == 0) {
                 return false;
             }
         }
         return true;
     }
 }
 