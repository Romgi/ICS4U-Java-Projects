/*
 * Jonathan Graydon
 * Triangle Area Calculator
 * This program will calculate the area of a triangle based on its three side lengths
 * It will then find the largest triangle and print the side lengths
 */

 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class TriangleAreaClass {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         ArrayList<Triangle> triangles = new ArrayList<>();
 
         System.out.println("Enter the number of triangles you want to add: ");
         int numTriangles = sc.nextInt();
 
         double side1;
         double side2;
         double side3;
 
         for (int i = 0; i < numTriangles; i++) {
             System.out.println("Triangle number: " + (i + 1));
             System.out.print("What is the first side length for triangle " + (i + 1) + ": ");
             side1 = sc.nextDouble();
             System.out.print("What is the second side length for triangle " + (i + 1) + ": ");
             side2 = sc.nextDouble();
             System.out.print("What is the third side length for triangle " + (i + 1) + ": ");
             side3 = sc.nextDouble();
 
             // Add the triangle to the list
             triangles.add(new Triangle(side1, side2, side3));
         }
 
         // Find the triangle with the largest area
         Triangle largestTriangle = null;
         double maxArea = 0;
 
         for (Triangle triangle : triangles) {
             double area = triangle.calculateArea();
             if (area > maxArea) {
                 maxArea = area;
                 largestTriangle = triangle;
             }
         }
 
         // Display the triangle with the largest area
         if (largestTriangle != null) {
             System.out.println("The triangle with the largest area has sides: "
                     + largestTriangle.side1 + ", " + largestTriangle.side2 + ", " + largestTriangle.side3);
             System.out.println("The largest area is: " + maxArea);
         } else {
             System.out.println("No triangles were entered.");
         }
 
         sc.close();
     }
 }
 
 class Triangle {
     double side1;
     double side2;
     double side3;
 
     // Constructor
     public Triangle(double side1, double side2, double side3) {
         this.side1 = side1;
         this.side2 = side2;
         this.side3 = side3;
     }
 
     // Calculate the area of the triangle
     public double calculateArea() {
         double s = (side1 + side2 + side3) / 2; // Semi-perimeter
         return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
     }
 }
 