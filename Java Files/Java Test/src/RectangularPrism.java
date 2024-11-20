/*
 * Jonathan Graydon
 * Rectangular Prism Calculator
 * This program will calculate the volume and surface area of a rectangular prism
 */

 import java.util.Scanner;

public class RectangularPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dimensions dimensions = new dimensions();

        System.out.println("Enter the length"); dimensions.length = sc.nextDouble();
        System.out.println("Enter the width"); dimensions.width = sc.nextDouble();
        System.out.println("Enter the height"); dimensions.height = sc.nextDouble();

        double volume = dimensions.length * dimensions.width * dimensions.height;
        double surfaceArea = (2 * ());
        System.out.println("The volume is: " + volume);
        System.out.println("The surface area is: " + surfaceArea);
   } 
}

class dimensions{
    double length = 0.0;
    double width = 0.0;
    double height = 0.0;
}
