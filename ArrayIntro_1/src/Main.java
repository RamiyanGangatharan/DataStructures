import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] charArray = new char[5]; // This by itself would print out null as no values are stored

        // Looping through an array
        // using ASCII characters to loop thru the alphabet
        for (int i = 0; i < charArray.length; i++) { charArray[i] = (char)(i+65); }
        System.out.println(charArray);

        // Integer arrays cannot be printed out by themselves and need a toString wrapper.
        int [] intArray = {5,12, 17, 64, 67};
        System.out.println(Arrays.toString(intArray));

        // using a for loop to traverse the array of integers
        for (int j = 0; j < intArray.length; j++) { System.out.println(intArray[j] + " "); }

        // An enhanced for-loop version of the above loop.
        for (int k : intArray) { System.out.print(k + " "); }
    }
}