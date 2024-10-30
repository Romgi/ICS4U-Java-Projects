/*
 * Jonathan Graydon
 * Filtering An Array
 * This program will take in 10 strings from the user
 * Then it will print only the strings with an even number of characters
 */

 import java.util.Scanner;


public class FilteringAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = new String[10];

        for (int i = 0; i<=9; i++){ //User inputs strings
            System.out.println("Enter string " + (i+1));
            array[i] = sc.nextLine();
        }
        System.out.println("The even length strings are: ");
        for (int i = 0; i< array.length; i++){ //Loops through array
            if(array[i].length()%2 == 0){ //If length is even 
                System.out.println(array[i]);
            }
            else{
                continue;
            }
        }
    }
}
