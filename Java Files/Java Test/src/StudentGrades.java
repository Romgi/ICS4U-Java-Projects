/*
 * Jonathan Graydon
 * Student Grades
 * This program will help you manage student grades
 */

 import java.util.Scanner;
 import java.util.ArrayList;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> grades = new ArrayList<>();
        int max = 0;
        int min = 100;

        System.out.println("Enter each grade, type 'quit' to calculate: "); //User enters grades
        while(!grades.contains(("quit").toLowerCase())){
            grades.add(sc.nextLine());
        }
        grades.remove(grades.size() - 1);

        //Initialize variables for calculating stats
        int currentGrade = 0;
        int total = 0;
        int above50 = 0;
        int above90 = 0;

        for(int i = 0; i < grades.size(); i++){ //Calculates max min, total, and amount above 50 and 90
            currentGrade = Integer.parseInt(grades.get(i));
            total += currentGrade;

            if(currentGrade >= 50){above50++;} //If 50 or above
            if(currentGrade >= 90){above90++;} //If 90 or above

            if(currentGrade > max){max = currentGrade;} //Sets max grade
            else if(currentGrade < min){min = currentGrade;} //Sets min grade
        }

        //Print the stats
        System.out.println("The average grade is: " + total/grades.size());
        System.out.println("The number of people who got 50 or above is: " + above50); 
        System.out.println("The number of people who got 90 or above is: " + above90);
        System.out.println("The minimum grade is: " + min);
        System.out.println("The maximum grade is: " + max);
    }
}
