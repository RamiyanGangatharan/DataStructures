import java.util.Scanner;

public class Main {
    /**
     * This program was used in an in class activity called 1A1 where we are tasked in creating
     * a Java program to get used to programming again.
     *
     * @param args an array of arguments
     * @author Ramiyan Gangatharan
     * @since 9/3/2025
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("what is the number: ");
        double num = scanner.nextDouble();

        squareRoot(num);
    }

    /**
     * I made a helper function that squares a number without using the math library
     *
     * @param a a variable for a numerical input
     */
    private static void squareRoot(double a) {
        double rs = a * a;
        System.out.println(a + " squared is: " + rs);
    }
}