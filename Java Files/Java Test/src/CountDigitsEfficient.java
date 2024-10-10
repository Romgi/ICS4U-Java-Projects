import java.util.Scanner;

public class CountDigitsEfficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();
        int numDigits = (int) sentence.chars()
                .filter(Character::isDigit)
                .count();
        System.out.println("Number of digits: " + numDigits);
    }
}