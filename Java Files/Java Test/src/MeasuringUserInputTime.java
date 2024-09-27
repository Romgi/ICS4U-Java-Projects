//Short test using currentTime function

import java.util.Scanner;

public class MeasuringUserInputTime {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("Please enter your first name.");

        // Record the start time (i.e. the time immediately after prompting the user)
        long startTime = System.currentTimeMillis();

        // Wait for the user to press Enter, and read in their input
        String firstName = sc.nextLine();

        // Record the end time (i.e. the time immediately after the user submits their input)
        long endTime = System.currentTimeMillis();

        // Calculate elapsed time in milliseconds
        long inputTimeMilliseconds = endTime - startTime;

        // Display the result
        System.out.println("Hello " + firstName + "!");
        System.out.println("You took " + inputTimeMilliseconds + " ms to tell me your first name.");

        sc.close();
    }
}