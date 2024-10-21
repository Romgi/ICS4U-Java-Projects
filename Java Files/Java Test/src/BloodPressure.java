/*
 * Jonathan Graydon
 * Blood Pressure Diagnosis
 * This program will find out what lifestyle choices are contributing to high blood pressure
 */

import java.util.Scanner;

public class BloodPressure {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i <= 5; i++){
            switch(i){
                case 1: System.out.println("On a scale of 1-5, how obese would you consider yourself? "); int obese = sc.nextInt();
                if (obese > 5 || obese < 1){
                    System.out.println("Enter value between 1 and 5");
                    obese = 3; //Default
                }
                if (obese > 3){
                    System.out.println("Try to eat healtier food ");
                }
                else{
                    System.out.println("Your diet is ok ");
                }
                total = total + obese;
                i++;
                case 2: System.out.println("For each of the 7 days of the week, in how many do you not exercise? "); int active = sc.nextInt();
                if (active > 7 || active < 1){
                    System.out.println("Enter value between 1 and 7");
                    active = 4; //Default
                }
                if (active < 3){
                    System.out.println("Your activity levels are good ");
                }
                else{
                    System.out.println("You should exercise more ");
                }
                total = total + active;
                i++;
                case 3: System.out.println("Enter how many of your biological parents have high blood pressure (0-2): "); int parents = sc.nextInt();
                if (parents > 2 || parents < 0){
                    System.out.println("Enter value between 0 and 2");
                    parents = 0; //Default

                    total = total + parents;
                }
                if (parents > 0){
                    System.out.println("You have high blood pressure in your family so you are at higher risk ");
                }
                else{
                    System.out.println("High blood pressure is not common in your family ");
                }
                parents = parents * 10; //Weight factor for higher risk due to parents
                total = total + parents;
                i++;
                case 4: System.out.println("Do you smoke? no: [1] yes: [2]? "); int smoke = sc.nextInt();
                if(smoke != 1 && smoke != 2){
                    System.out.println("Enter either 1 or 2");
                    smoke = 1; //Default

                    smoke = (smoke - 1)* 10; //Binary input converted to either 0 or 10 since smoking contributes greatly to high blood pressure
                }
                if (smoke == 2){
                    System.out.println("You need to quit smoking ");
                }
                else{
                    System.out.println("You don't smoke which is good ");
                }
                total = total + smoke;
                i++;
                case 5: System.out.println("On a scale of 0-5, how much alcohol do you drink "); int alcohol = sc.nextInt();
                if(alcohol > 5 || alcohol < 0){
                    System.out.println("Enter value between 0 and 5");
                    alcohol = 0; //Default
                }
                if (alcohol > 1){
                    System.out.println("You should probably drink less alcohol");
                }
                else{
                    System.out.println("You don't drink that much alcohol which is good ");;
                }
                total = total + alcohol;
                i++;
            }
        }

        System.out.println("Doctors note: ");
        if (total > 18){
            System.out.println("You are likely to develop high blood pressure");
        }
        else if (total > 10){
            System.out.println("You have a moderate risk of high blood pressure");
        }
        else{
            System.out.println("You are at low risk of high blood pressure");
        }
        
    }
}
