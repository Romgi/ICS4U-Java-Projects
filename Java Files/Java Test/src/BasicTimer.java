/*
 * Jonathan Graydon
 * Basic Timer Program
 * This program will count down from a specified time
 */
import java.util.Scanner;

public class BasicTimer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userOk = "";

        System.out.println("Enter the amount of time you want to wait in seconds: "); int timeSeconds = sc.nextInt(); sc.nextLine();

        for (int i = timeSeconds; i >= 0; i--){
            System.out.println(timeSeconds);
            try{Thread.sleep(1000);} catch(InterruptedException e){}
            timeSeconds--;
        }
        System.out.println("Time is up! ");

        while(!userOk.equals("ok")){
            try{Thread.sleep(1000);} catch(InterruptedException e){}
            System.out.println("Type 'ok' to end the program: ");
            userOk = sc.nextLine();
        }
    }
}
