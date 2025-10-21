/**
 * A class to solve the Towers of Hanoi problem.
 * This class provides the helper methods, however students must implement the actual problem
 * solution by finishing the provided stub methods.
 */
public class TowersOfHanoiLab {
    static int n = 3; // Default number of discs for testing
    static int towerWidth = Math.max(n, 11);
    static Tower source = new Tower(centerPad("Tower A", towerWidth));
    static Tower auxiliary = new Tower(centerPad("Tower B", towerWidth));
    static Tower destination = new Tower(centerPad("Tower C", towerWidth));

    /**
     * The main method that sets up the Towers of Hanoi problem and solves it.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // TODO: Implement this method;

        Disc disc1 = new Disc(2);
        Disc disc2 = new Disc(4);
        Disc disc3 = new Disc(6);

        source.push(disc3);
        source.push(disc2);
        source.push(disc1);

        System.out.println("DEFAULT CONFIG:");
        printTowers();

        moveTopDisc(source, destination);
        moveTopDisc(source, destination);
        moveTopDisc(source,auxiliary);
        moveTopDisc(destination, auxiliary);
        moveTopDisc(source, destination);
        moveTopDisc(auxiliary, source);
        moveTopDisc(auxiliary, destination);
        moveTopDisc(source, destination);
    }

    /**
     * Solves the Towers of Hanoi problem recursively.
     *
     * @param n the number of discs to move
     * @param s the source tower
     * @param d the destination tower
     * @param a the auxiliary tower
     */
    public static void moveDiscs(int n, Tower s, Tower d, Tower a) {
        // TODO: Implement this method
    }

    /**
     * Moves the top disc from one tower to another and prints the updated state.
     *
     * @param s the source tower
     * @param d the destination tower
     * @throws IllegalArgumentException if the source or destination towers are null
     */
    public static void moveTopDisc(Tower s, Tower d) {
        if (s == null || d == null) { throw new IllegalArgumentException("Source or destination tower cannot be null."); }
        if (s.getSize() == 0) { System.out.println("ERROR: Source tower is empty!"); return; }

        Disc topSource = s.getTop();
        Disc topDestination = d.getTop();

        // Check if move is valid BEFORE moving
        if (topDestination == null || topSource.getWidth() < topDestination.getWidth()) {
            Disc moved = s.pop();
            d.push(moved);
            System.out.println("Moved disc " + moved.getWidth() + " from" + s.getName() + "to" + d.getName());
            printTowers();
        } else {
            System.out.println("ERROR: Cannot move disc " + topSource.getWidth() + " onto smaller disc " + topDestination.getWidth() + " in" + d.getName());
        }
    }


    /**
     * Centers a string within a given length, padding with spaces as necessary.
     *
     * @param input the string to center
     * @param length the desired total length
     * @return the centered string
     * @throws IllegalArgumentException if the input string is null
     */
    public static String centerPad(String input, int length) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        if (input.length() >= length) {
            return input;
        }

        int totalPadding = length - input.length();
        int leftPadding = totalPadding / 2;
        int rightPadding = totalPadding - leftPadding;

        return " ".repeat(leftPadding) + input + " ".repeat(Math.max(0, rightPadding));
    }

    /**
     * Prints the current state of all three towers.
     */
    public static void printTowers() {
        System.out.println();
        int max = Math.max(source.getSize(), Math.max(auxiliary.getSize(), destination.getSize()));
        Disc l = source.getTop();
        Disc c = auxiliary.getTop();
        Disc r = destination.getTop();
        for (int i = max; i > 0; i--) {
            l = printTowerDiscOrBlank(source, l, i);
            c = printTowerDiscOrBlank(auxiliary, c, i);
            r = printTowerDiscOrBlank(destination, r, i);
            System.out.println();
        }
        System.out.println(source.getName() + auxiliary.getName() + destination.getName());
        System.out.println();
    }

    /**
     * Prints a disc or blank space for a given tower.
     *
     * @param t the tower
     * @param d the disc to print
     * @param i the current level
     * @return the next disc to print
     */
    private static Disc printTowerDiscOrBlank(Tower t, Disc d, int i) {
        if (t.getSize() >= i) {
            return printDisc(d);
        } else {
            printBlanks();
            return d;
        }
    }

    /**
     * Prints a disc with padding for visual representation.
     *
     * @param disc the disc to print
     * @return the disc below the current disc
     */
    public static Disc printDisc(Disc disc) {
        if (disc == null) {
            printBlanks();
            return null;
        }
        System.out.print(centerPad("-".repeat(disc.getWidth()), towerWidth));
        return disc.getBelow();
    }

    /**
     * Prints blank spaces for visual alignment.
     */
    public static void printBlanks() {
        System.out.print(" ".repeat(towerWidth));
    }


}
