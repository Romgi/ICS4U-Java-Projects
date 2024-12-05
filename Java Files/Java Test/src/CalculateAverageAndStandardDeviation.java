/*
 * Jonathan Graydon
 * Average and Standard Deviation
 * This program calculates the average and standard deviation from a text file containing numbers.
 */

 import java.io.*;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Scanner;
 
 public class CalculateAverageAndStandardDeviation {
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a file name: ");
         String fileName = sc.nextLine();
         List<Double> numbers = new ArrayList<>();
 
         // Read numbers from the file
         try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
             String line;
             while ((line = br.readLine()) != null) {
                 numbers.add(Double.parseDouble(line.trim()));
             }
         } catch (IOException e) {
             System.out.println("Error reading file: " + e.getMessage());
             return;
         }
 
         // Calculate average and standard deviation
         double average = calculateAverage(numbers);
         double standardDeviation = calculateStandardDeviation(numbers, average);
 
         // Display results
         System.out.printf("Average: %.2f%n", average);
         System.out.printf("Standard Deviation: %.2f%n", standardDeviation);
     }
 
     // Method to calculate average
     private static double calculateAverage(List<Double> numbers) {
         double sum = 0.0;
         for (double num : numbers) {
             sum += num;
         }
         return sum / numbers.size();
     }
 
     // Method to calculate standard deviation
     private static double calculateStandardDeviation(List<Double> numbers, double average) {
         double sumSquaredDifferences = 0.0;
         for (double num : numbers) {
             sumSquaredDifferences += Math.pow(num - average, 2);
         }
         return Math.sqrt(sumSquaredDifferences / numbers.size());
     }
 }
 