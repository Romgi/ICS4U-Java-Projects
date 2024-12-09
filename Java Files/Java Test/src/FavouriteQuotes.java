/*
 * Jonathan Graydon
 * Favourite Quotes
 * This program will collect quotes from the user and save them in a text file
 */

 import java.io.*;
 import java.util.Scanner;

public class FavouriteQuotes {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int startChoice = 1;

        //Loops if the user doesn't quit
        while (startChoice == 1) { 
        System.out.println("Do you want to enter a quote? Yes [1] No[2]: ");
        startChoice = sc.nextInt();

            //Decides what to do based on user selected choice
            switch (startChoice){
                case 1: System.out.println("Enter the quote to add: ");
                String quoteToAdd = sc.nextLine();
                quoteToAdd = sc.nextLine();
                addQuote(quoteToAdd);
                break;
                default: System.out.println("Quitting program...");
            }
        }
    }

    //Method for adding a quote so the program is modular
    public static void addQuote(String quote) throws IOException{
        PrintWriter writer = new PrintWriter("Quotes.txt");
        writer.println(quote);
        writer.close();
    }
}
