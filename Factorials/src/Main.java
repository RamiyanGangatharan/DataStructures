public class Main {
    public static void main(String[] args) {
        System.out.println("Normal Factorial Calculation: \n");
        for (int i = 1; i < 15; i++) { System.out.println("Factorial of " + i + ": " + factorial(i)); }

        System.out.println();
        System.out.println("Recursive Factorial Calculation: \n");
        for (int i = 1; i < 15; i++) { System.out.println("Factorial of " + i + ": " + factorialRecursive(i));}
    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) { result *= i; }
        return result;
    }

    // This reduces the amount of operations required externally by referring to itself.
    public static int factorialRecursive(int number) {
        if (number == 0) { return 1; }
        else { return number * factorialRecursive(number - 1); }
    }
}
