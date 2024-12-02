/*
 * Jonathan Graydon
 * Contact Book Program
 * This program stores contacts with their phone number, address, and email, and lets you add or retrieve them.
 */

 import java.util.HashMap;
 import java.util.Map;
 import java.util.Scanner;
 
 public class ContactBookClass {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         // Create contact list map
         Map<String, Contact> contactList = new HashMap<>();
 
         // Loop indefinitely unless the program is quit
         while (true) {
             System.out.println("Enter an action: add [1], get [2], or quit [0]");
             int selectedAction = sc.nextInt();
             sc.nextLine(); // Consume the newline character
 
             // Execute desired action
             switch (selectedAction) {
                 case 0: {
                     System.out.println("Quitting program...");
                     return;
                 }
                 case 1: {
                     System.out.println("Enter the contact's name: ");
                     String name = sc.nextLine();
 
                     System.out.println("Enter the contact's phone number: ");
                     String phoneNumber = sc.nextLine();
 
                     System.out.println("Enter the contact's address: ");
                     String address = sc.nextLine();
 
                     System.out.println("Enter the contact's email: ");
                     String email = sc.nextLine();
 
                     addContact(name, new Contact(phoneNumber, address, email), contactList);
                     System.out.println("Contact added: " + name);
                 }
                 case 2: {
                     System.out.println("Enter the name of the contact to retrieve: ");
                     String contactToGet = sc.nextLine();
 
                     Contact contact = getContact(contactToGet, contactList);
                     if (contact != null) {
                         System.out.println("Contact information for " + contactToGet + ":");
                         System.out.println("Phone Number: " + contact.getPhoneNumber());
                         System.out.println("Address: " + contact.getAddress());
                         System.out.println("Email: " + contact.getEmail());
                     } else {
                         System.out.println("Contact not found.");
                     }
                 }
                 default: System.out.println("Invalid action. Please select a valid option.");
             }
         }
     }
 
     // Function to add a contact
     public static void addContact(String name, Contact contact, Map<String, Contact> contactList) {
         contactList.put(name, contact);
     }
 
     // Function to get a contact
     public static Contact getContact(String name, Map<String, Contact> contactList) {
         return contactList.get(name);
     }
 }
 
 // Contact class
 class Contact {
     private String phoneNumber;
     private String address;
     private String email;
 
     // Constructor
     public Contact(String phoneNumber, String address, String email) {
         this.phoneNumber = phoneNumber;
         this.address = address;
         this.email = email;
     }
 
     // Getters
     public String getPhoneNumber() {
         return phoneNumber;
     }
 
     public String getAddress() {
         return address;
     }
 
     public String getEmail() {
         return email;
     }
 }
 