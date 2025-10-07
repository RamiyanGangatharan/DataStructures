/**
 * Implement three number based algorithms that must be solved recursively.
 * Each will needs its own method that will be called from main().
 */
public class ProblemOne {
    /**
     * Recursively sum the digits of a number until it becomes a single digit.
     * 24 -> 2 + 4 = 6
     *
     * @param num a number
     * @return number
     */
    public static int reduceToSingleDigit(int num) {
        // BASE CASE
        if (num < 10) {
            return num;
        }

        /*
         * The modulus operator extracts the last digit of the number.
         * This digit is then added recursively to the sum of the remaining digits,
         * obtained by dividing the number by 10. The process continues
         * until the number is reduced to a single digit.
         */
        int sum = (num % 10) + reduceToSingleDigit(num / 10);
        if (sum >= 10) {
            return reduceToSingleDigit(sum);
        }
        return sum;
    }

    /**
     * Given a number and a current divisor to check (always beginning with 2), determine
     * if it is a factorial of some integer recursively ex. (120, 2) would return 5.
     *
     * @param num a number
     * @param div a current divisor
     * @return a number
     */
    public static int reverseFactorial(int num, int div) {
        if (num < 0) { num = Math.abs(num); }
        if (num == 1) { return div - 1; }
        if (num % div != 0) { return -1; }
        return reverseFactorial(num / div, div + 1);
    }

    /**
     * 8
     * Returns the sum of the squares of the digits. ex. 23 -> 2^2 + 3^2 = 13.
     *
     * @param num a number
     * @return a number
     */
    public static int sumSquaresDigits(int num) {
        int digit = ((num % 10) * (num % 10));
        return (num == 0) ? 0 : digit + sumSquaresDigits(num / 10);
    }
}
