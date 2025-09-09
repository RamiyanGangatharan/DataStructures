/**
 * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
 * @param n a number
 * @return the absolute difference between n and 21
 *
 * note: absolute difference is just the absolute value.
 */
public class Diff21 {
    public static int diff21(int n) {
        if (n > 21) {
            System.out.println((n-21)*2);
            return (n - 21) * 2;
        }
        else {
            System.out.println(21-n);
            return 21 - n;
        }
    }
}
