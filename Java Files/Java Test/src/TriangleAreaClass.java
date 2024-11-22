/*
 * Jonathan Graydon
 * Triangle Area Calculator
 * This program will calculate the area of a triangle based on its three side lengths
 * It will then find the largest triangle and print the side lengths
 */

 import java.util.Scanner;
 import java.util.ArrayList;

public class TriangleAreaClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of triangles you want to add: ");
        int numTriangles = sc.nextInt();

        for(int i = 0; i < numTriangles; i++){
            System.out.println("Triangle number: " + i++);
            System.out.println("What is the first side length for triangle " + i++);
            double side1 = sc.nextDouble();
            System.out.println("What is the second side length for triangle " + i++);
            double side2 = sc.nextDouble();
            System.out.println("What is the third side length for triangle " + i++);
            double side3 = sc.nextDouble();
        }
    }
}
