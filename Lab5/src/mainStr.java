import java.util.Scanner;

public class mainStr {
    public static String str = "";
    public static char ch = ' ';
    public static int option = 0;

    public static void main(String[] args) {
        while (option != -1) {
            printMenu();
            switch (option) {
                case 1:
                    System.out.println("The number of vowels in  " + str + " is: " + ProblemTwo.countVowels(str));
                    break;
                case 2:
                    System.out.println("The reverse of \"" + str + "\" is \"" + ProblemTwo.reverse(str) + "\"");
                    break;
                case 3:
                    System.out.println("The interWEAVED string is \"" + ProblemTwo.interweaveChar(str, ch) + "\"");
                    break;
                case 0:
                    option = -1;
                    break;
            }
        }
    }

    //Welcome to Silly Strings
    //   1. Count Vowels
    //   2. Reverse String
    //   3. Interleave Character
    //   0. Exit
    //Choose an Option: 1
    //Enter a string: hello
    //The number of vowels in "hello" is 2
    public static void printMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nWelcome to Silly Strings\n");
        System.out.println("   1. Count Vowels");
        System.out.println("   2. Reverse String");
        System.out.println("   3. Interweave Character");
        System.out.println("   0. Close For the Day");
        System.out.print("Enter your choice: ");
        option = keyboard.nextInt();
        if (option != 0) {
            System.out.print("Enter a String(one word): ");
            str = keyboard.next();
        }
        if (option == 3) {
            System.out.print("Enter a String to interWEAVE: ");
            ch = keyboard.next().charAt(0);//
        }
    }
}