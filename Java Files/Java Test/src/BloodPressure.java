/*
 * Jonathan Graydon
 * Blood Pressure Diagnosis
 * This program will find out what lifestyle choices are contributing to high blood pressure
 */

import java.util.Scanner;

public class BloodPressure {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            switch(i){
                case 1: System.out.println("On a scale of 1-5, how obese would you consider yourself? "); int obese = sc.nextInt();
                if (obese > 5 || obese < 1){
                    System.out.println("Enter value between 1 and 5");
                    obese = 3; //Default
                }
                case 2: System.out.println("For each of the 7 days of the week, how many do you exercise? "); int active = sc.nextInt();
                if (active > 7 || active < 1){
                    System.out.println("Enter value between 1 and 7");
                    active = 4; //Default
                }
                case 3: System.out.println("Enter how many of your biological parents have high blood pressure (0-2): "); int parents = sc.nextInt();
                if (parents > 2 || parents < 0){
                    System.out.println("Enter value between 0 and 2");
                    parents = 0; //Default
                }
                case 4: System.out.println("Do you smoke? no: [1] yes: [2]? "); int smoke = sc.nextInt();
                if(smoke != 1 && smoke != 2){
                    System.out.println("Enter either 1 or 2");
                    smoke = 1; //Default
                }
                smoke = (smoke - 1)* 10; //Binary input converted to either 0 or 10 since smoking contributes greatly to high blood pressure
                case 5: System.out.println("On a scale of 0-5, how much do you drink alcohol? "); int alcohol = sc.nextInt();
                if(alcohol > 5 || alcohol < 0){
                    System.out.println("Enter value between 0 and 5");
                    alcohol = 0; //Default
                }

            }
        }

        
    }
}
