/*
 * Jonathan Graydon
 * Calculator Function
 * This program will accept three arguments, two numbers and a character representing the operator
 * The program will then calculate the result based on the numbers and the operator
 */

public class CalculatorFunction{
    public static void main(String[] args) {

        //Test values
        int num1test1 = 2; int num2test1 = 3; char test1operator = 'a'; 
        int num1test2 = 10; int num2test2 = 5; char test2operator = 's';
        int num1test3 = 5; int num2test3 = 5; char test3operator = 'm';
        int num1test4 = 15; int num2test4 = 5; char test4operator = 'd';

        //Test cases
        System.out.println(calculator(num1test1, num2test1, test1operator)); 
        System.out.println(calculator(num1test2, num2test2, test2operator));
        System.out.println(calculator(num1test3, num2test3, test3operator));
        System.out.println(calculator(num1test4, num2test4, test4operator));
    }

    //Calculator method
    public static int calculator(int num1, int num2, char operator){
        int output = 0;
        //Checks operator and performs corresponding calculation
        if(operator == 'a'){
            output = num1 + num2;
        }
        else if(operator == 's'){
            output = num1 - num2;
        }
        else if(operator == 'm'){
            output = num1 * num2;
        }
        else if(operator == 'd'){
            output = num1 / num2;
        }
        else{
            System.out.println("Error");
        }

        return output;

    }
}