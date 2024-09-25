/* Jonathan Graydon
    Season Detector
    This program will detect what season it is based on temperature inputs
 */

import java.util.Scanner;

public class SeasonDetector {
    public static void main(String[]args){
        Scanner sn = new Scanner(System.in);

        //User temperature input for each day of the week
        System.out.println("Enter the temperature for Monday: "); double monday = sn.nextDouble();
        System.out.println("Enter the temperature for Tuesday: "); double tuesday = sn.nextDouble();
        System.out.println("Enter the temperature for Wednesday: "); double wednesday = sn.nextDouble();
        System.out.println("Enter the temperature for Thursday: "); double thursday = sn.nextDouble();
        System.out.println("Enter the temperature for Friday: "); double friday = sn.nextDouble();
        System.out.println("Enter the temperature for Saturday: "); double saturday = sn.nextDouble();
        System.out.println("Enter the temperature for Sunday: "); double sunday = sn.nextDouble();

        //Averages the temperatures
        double tempTotal = (monday + tuesday + wednesday + thursday + friday + saturday + sunday);
        double tempAverage = (tempTotal/7);

        //Prints the results depending on average temperature
        if(tempAverage > 20){
            System.out.println("its Summer!");
        }
        else if(tempAverage > 0){
            System.out.println("its Spring/Fall");
        }
        else if(tempAverage < 0){
            System.out.println("its Winter");
        }
    }
}
