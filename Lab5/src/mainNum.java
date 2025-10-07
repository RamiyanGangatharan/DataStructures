import java.util.Scanner;

public class mainNum {
    public static int num = 0;
    public static int option = 0;

    public static void main(String[] args) {
        while (option != -1) {
            printMenu();
            switch (option) {
                case 1:
                    System.out.println("The single-digit reduction of " + num + " is: " + ProblemOne.reduceToSingleDigit(num));
                    break;
                case 2:
                    //check if factorial is not valid
                    if (ProblemOne.reverseFactorial(num, 2) == -1) {
                        System.out.println(num + " is not a factorial of any integer");
                        break;
                    }
                    System.out.println(num + " is a factorial of " + ProblemOne.reverseFactorial(num, 2));
                    break;
                case 3:
                    System.out.println("The sum of the squares of the digits of " + num + " are " +
                            ProblemOne.sumSquaresDigits(num));
                    break;
                case 0: option = -1; break;
            }
        }
    }


    public static void printMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nWelcome to the Numbers Game\n");
        System.out.println("   1. Reduce to Single Digit");
        System.out.println("   2. Reverse Factorial");
        System.out.println("   3. Sum of Squares of Digits");
        System.out.println("   0. Close For the Day");
        System.out.print("Enter your choice: ");
        option = keyboard.nextInt();
        if (option != 0) {
            System.out.print("Enter a number: ");
            num = keyboard.nextInt();
        }
    }
}
