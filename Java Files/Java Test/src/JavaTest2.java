/*
 * Jonathan Graydon
 * JavaTest2
 * This program will print numbers from 100 to 1 with information about their factors
 * ICS4U Java Test Number 2
 */

public class JavaTest2 {
    public static void main(String[]args){

        int num = 100; //Starting Value

        while(num >= 1){ //Loop from start to 1
            System.out.println(num);
            if (num % 4 == 0 && num % 2 == 0){ //If divisible by 4 and 2
                System.out.println("even quatro");
            }
            else if (num % 2 == 0){ //If only divisible by 2
                System.out.println("even");
            }
            num--; //Decrement
        }
    }
}
