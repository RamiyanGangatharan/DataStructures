import java.util.ArrayList;

public class Main {
    /**
     * This program creates an array of 25, then populates the array with numbers with the power of 2,
     * beginning from zero. Then print out the array with the correct values.
     * @param args a string array of arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<>(25);
        for (int i = 0; i < 25; i++) { array.add(Math.pow(2, i)); }
        System.out.println(array);
    }
}
