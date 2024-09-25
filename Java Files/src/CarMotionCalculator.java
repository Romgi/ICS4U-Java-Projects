/* Jonathan Graydon
    Car Motion Calculator
    Program will calculate values based on a car's distance, time, and speed
 */

import java.util.Scanner;

public class CarMotionCalculator {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);


        double speed = 0.0;
        double distance = 0.0;
        double time = 0.0;

        System.out.print("Enter the value you would like to calculate (distance, speed, or time): [d], [s], [t]: ");
        String selectedValue = sn.nextLine();

        if (selectedValue.equals("d")){
            System.out.println("Enter the speed: "); speed = sn.nextDouble();
            System.out.println("Enter the time: "); time = sn.nextDouble();
            distance = speed * time;
        }
        else if (selectedValue.equals("s")){
            System.out.println("Enter the distance: "); distance = sn.nextDouble();
            System.out.println("Enter the time: "); time = sn.nextDouble();
            speed = distance / time;
        }
        else if (selectedValue.equals("t")){
            System.out.println("Enter the distance: "); distance = sn.nextDouble();
            System.out.println("Enter the speed: "); speed = sn.nextDouble();
            time = distance / speed;
        }
        else{
            System.out.println("Incorrect value.");
        }
        System.out.println("The distance is: " + distance);
        System.out.println("The speed is: " + speed);
        System.out.println("The time is: " + time);

    }
}
