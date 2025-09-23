import java.util.Arrays;

public class Main {
    /**
     * This program creates an array of 25, then populates the array with numbers with the power of 2,
     * beginning from zero. Then print out the array with the correct values.
     * @param args a string array of arguments
     */
    public static void main(String[] args) {
        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) { array[i] = (int) Math.pow(2, i); }
        System.out.println(Arrays.toString(array));
    }
}