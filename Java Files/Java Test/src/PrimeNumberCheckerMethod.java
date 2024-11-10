

/*
 * Jonathan Graydon
 * Prime Number Checker using a method
 * This program will use a method 'is_prime_number' that accepts a single argument: a positive integer 'num'
 * The method will output whether num is a prime or not
 */

public class PrimeNumberCheckerMethod {
    public static void main(String[] args) {
        
        //Test values
        int num1 = 16;
        int num2 = 41;

        //Test cases
        System.out.println(num1 + is_prime_number(num1));
        System.out.println(num2 + is_prime_number(num2));
    }

    //Prime number check function
    public static String is_prime_number(int num){
        String result = "";

        //Loop through possible factors between 1 and num
        for(int i = 2; i < num; i++){

            //If number is divisible by any of the possible factors
            if((num % i) == 0){ 
                result = " is not a prime number.";
                break;
            }

            //If not divisible by any other int, return prime
            else{
                result = " is a prime number";
            }
        }
        return result;
    }
}
