/*
 * Jonathan Graydon
 * Contact Book
 * This program allows the user to store and manage contact information and phone number
 */

 import java.util.Scanner;
 import java.util.HashMap;
 import java.util.Map;

public class ContactBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> contactList = new HashMap<>();

        while (true){
            System.out.println("Enter an action, add [1], get [2], update [3], remove [4], display [5], or quit [0]");
            int selectedAction = sc.nextInt();
            switch (selectedAction){
                default: {System.out.println("Error, enter a valid option");}
                case 0: {System.out.println("Quitting Program..."); break;}
                case 1: {
                    System.out.println("Enter the name, then phone number of the contact: ");
                    String contactToAddName = sc.nextLine();
                    int phoneNumberToAdd = sc.nextInt();
                    addContact(contactToAddName, phoneNumberToAdd, contactList);}
                case 2: {
                    System.out.println("Enter the name of the contact: ");
                    String contactToGet = sc.nextLine();
                    getPhoneNumber(contactToGet, contactList);}
                case 3: {
                    System.out.println("Enter name of contact to update, and the new phone number: ");
                    String contactToUpdate = sc.nextLine();
                    int newPhoneNumber = sc.nextInt();
                    updatePhoneNumber(contactToUpdate, newPhoneNumber, contactList);}
                case 4: {
                    System.out.println("Enter the name of the contact you want to remove: ");
                    String contactToRemove = sc.nextLine();
                    removeContact(contactToRemove, contactList);}
                case 5: {
                    displayList(contactList);}
            }
        }


    }
    public static void addContact(String name, int number, Map <String, Integer> contactList){
        contactList.put(name, number);
    }
    public static void getPhoneNumber(String name, Map <String, Integer> contactList){
       contactList.get(name);
    }
    public static void updatePhoneNumber(String name, int number, Map <String, Integer> contactList){
       contactList.put(name, number);
    }
    public static void removeContact(String name, Map <String, Integer> contactList){
       contactList.remove(name);
    }
    public static void displayList(Map <String, Integer> contactList){
        System.out.println(contactList);
    }

}
