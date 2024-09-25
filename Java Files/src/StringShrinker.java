/* Jonathan Graydon
    String Shrinker
    This program will shrink a string by an entered amount of characters
 */

import java.util.Scanner;

public class StringShrinker {
    public static void main(String[]args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the string: "); String string = sn.nextLine();
        System.out.println("Enter the number of characters to cut: "); int num = sn.nextInt();
        int len = string.length(); int cut = len-num;
        String newString = string.substring(0,cut);
        System.out.println("The new string is: " + newString);

    }
}
