/*
 * Jonathan Graydon
 * Contact Book Program
 * This program will store phone numbers and names of contacts and let you modify them
 */


import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ContactBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Create contactList Hashmap
        Map<String, Integer> contactList = new HashMap<>();

        //Loop indefinitely unless the program is quit
        while (true) {
            System.out.println("Enter an action, add [1], get [2], update [3], remove [4], display [5], or quit [0]");
            int selectedAction = sc.nextInt();
            sc.nextLine();

            //Runs desired action
            switch (selectedAction) {
                case 0:
                    System.out.println("Quitting Program...");
                    return;
                case 1:
                    System.out.println("Enter the name, then phone number of the contact: ");
                    String contactToAddName = sc.nextLine();
                    int phoneNumberToAdd = sc.nextInt();
                    addContact(contactToAddName, phoneNumberToAdd, contactList);
                    System.out.println("Contact added: " + contactToAddName + " - " + phoneNumberToAdd);
                    break;
                case 2:
                    System.out.println("Enter the name of the contact: ");
                    String contactToGet = sc.nextLine();
                    Integer phoneNumber = getPhoneNumber(contactToGet, contactList);
                    if (phoneNumber != null) {
                        System.out.println("Phone number for " + contactToGet + ": " + phoneNumber);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter name of contact to update, and the new phone number: ");
                    String contactToUpdate = sc.nextLine();
                    int newPhoneNumber = sc.nextInt();
                    updatePhoneNumber(contactToUpdate, newPhoneNumber, contactList);
                    System.out.println("Contact updated: " + contactToUpdate + " - " + newPhoneNumber);
                    break;
                case 4:
                    System.out.println("Enter the name of the contact you want to remove: ");
                    String contactToRemove = sc.nextLine();
                    removeContact(contactToRemove, contactList);
                    System.out.println("Contact removed: " + contactToRemove);
                    break;
                case 5:
                    displayList(contactList);
                    break;
                default:
                    System.out.println("Error, enter a valid option");
                    break;
            }
        }
    }

    //Functions for modifying the contactList
    public static void addContact(String name, int number, Map<String, Integer> contactList) {
        contactList.put(name, number);
    }
    public static Integer getPhoneNumber(String name, Map<String, Integer> contactList) {
        return contactList.get(name);
    }
    public static void updatePhoneNumber(String name, int number, Map<String, Integer> contactList) {
        contactList.put(name, number);
    }
    public static void removeContact(String name, Map<String, Integer> contactList) {
        contactList.remove(name);
    }
    public static void displayList(Map<String, Integer> contactList) {
        System.out.println("Contact List: ");
        for (Map.Entry<String, Integer> entry : contactList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}