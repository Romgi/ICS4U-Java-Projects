/*
 * Jonathan Graydon
 * Contact Book With File Storage
 * This program will save the name, age, and phone number entered for each contact
 * The program will then write the data into a .txt file for storage
 */

 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.Scanner;
 
 public class ContactBookFile {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         StringBuilder contacts = new StringBuilder();

         //Loop indefinetly
         while (true) {
            //User input
             System.out.print("Enter the name of the contact: ");
             String name = scanner.nextLine();
 
             System.out.print("Enter the age of the contact: ");
             int age = scanner.nextInt();
             scanner.nextLine(); //Fixes scanner not accepting value for some reason
 
             System.out.print("Enter the phone number of the contact: ");
             String phone = scanner.nextLine();
 
             //Build String with contact info
             //Uses java's string builder
             //https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html
             contacts.append(String.format("Name: %s, Age: %d, Phone: %s%n", name, age, phone));
 
             System.out.print("Do you want to add another contact? (yes/no): ");
             String response = scanner.nextLine().trim().toLowerCase();
 
             if (!response.equals("yes")) {
                 break;
             }
         }
 
         // Saves all of the values into a text file
         //Make sure that the fileName matches EXACTLY with the file being written
         try (FileWriter writer = new FileWriter("Contacts.txt")) {
             writer.write(contacts.toString());
             System.out.println("Contacts saved successfully to contacts.txt");
         } catch (IOException e) {
             System.out.println("An error occurred while saving contacts: " + e.getMessage());
         }
 
         scanner.close();
     }
 }
 
