import java.util.Random;
/* Jonathan Graydon
    Dice Roll Simulator
    This program will simulate rolling a dice
 */


public class DiceRoll {
    public static void main(String[] args) {

        //Randomization
        Random random = new Random();
        int die1 = random.nextInt(3) + 1;
        int die2 = random.nextInt(3) + 1;
        int total = die1 + die2;

        //Printing result of first die
        System.out.print("First die - ");
        if (die1 == 1) {
            System.out.println("ONE");
        } else if (die1 == 2) {
            System.out.println("TWO");
        } else {
            System.out.println("THREE");
        }

        //Printing Result of the second die
        System.out.print("Second die - ");
        if (die2 == 1) {
            System.out.println("ONE");
        } else if (die2 == 2) {
            System.out.println("TWO");
        } else {
            System.out.println("THREE");
        }

        //Printing Total
        System.out.print("Total - ");
        if (total == 2) {
            System.out.println("TWO");
        } else if (total == 3) {
            System.out.println("THREE");
        } else if (total == 4) {
            System.out.println("FOUR");
        } else if (total == 5) {
            System.out.println("FIVE");
        } else {
            System.out.println("SIX");
        }
    }
}