/*
 * Jonathan Graydon
 * CD Collection
 * This program will help you keep track of your CD collection
 */

 import java.util.Scanner;
 import java.util.ArrayList;

public class CDCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> CDs = new ArrayList<>();

        System.out.println("Enter the name of a CD or enter 'quit': ");
        while(!CDs.contains(("quit").toLowerCase())){
            CDs.add(sc.nextLine());
        }
        CDs.remove(CDs.size() - 1);
        System.out.println("-----Current Collection-----");
        for(int i = 0; i < CDs.size(); i++){
            System.out.println(CDs.get(i));
        }
    }
}
