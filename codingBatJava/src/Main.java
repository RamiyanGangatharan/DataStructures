import java.util.Scanner;

public class Main {
    /**
     * The point of this file is to run codingBat exercises for activity 1A2 in Data Structures.
     * <p>
     * Instructions:
     * <p>
     * Go to <a href="https://codingbat.com/javaLinks">...</a> to an external site. (you can sign up for an account to save your progress, or just proceed to solving problems).
     * <p>
     * Click on Warmup-1 to view a series of problems that must be solved using java. As you solve each one, you will have a green checkmark indicating success.
     * <p>
     * Solve 2-3 problems other than the one we’ll use as an example.
     * <p>
     * Take a screenshot of your Warmup-1 screen with your checkmarks, and submit that on Canvas to Activity 1B2.
     * <p>
     * I will be doing the following exercises: SleepIn, Diff21, and notString
     * @param args an array of string arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Activity 1A2: CodingBat Questions");
        System.out.println("---------------------------------");

        System.out.println("Options: ");
        System.out.println("[1]: Sleep In Determiner");
        System.out.println("[2]: Diff21");
        System.out.println("[3]: notString");

        int option = scanner.nextInt();

        switch (option) {
            case 1: SleepIn.sleepIn(true, true); break;
            case 2: Diff21.diff21(15); break;
            case 3: NotString.notString("not rami"); break;
            default: System.out.println("Invalid Input"); break;
        }
    }
}