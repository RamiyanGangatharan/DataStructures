import java.awt.*;

public class Activity1B1 {

    /**
     * - create 5 point objects within a 5x5 grid (0,0) at the bottom left
     * - Implement a method that will print out a grid using ASCII
     * <p>
     * points: asterisk
     * grid: dashes and columns
     */
    public static void grid(Point p1, Point p2, Point p3, Point p4, Point p5) {

        // It is easier to do an array as we did a tik tak toe game in DC like this.
        // I apologize for being more inefficient
        Point[] points = {p1, p2, p3, p4, p5};

        for (int y = 5; y >= 0; y--) {
            for (int x = 0; x <= 5; x++) { System.out.print("+---"); }
            System.out.println("+");

            // The row with cells
            for (int x = 0; x <= 5; x++) {
                boolean isPoint = false;
                for (Point p : points) {
                    if (p.x == x && p.y == y) {
                        System.out.print("| * ");
                        isPoint = true;
                        break;
                    }
                }
                if (!isPoint) { System.out.print("|   "); }
            }
            System.out.println("|");
        }

        // Bottom border
        for (int x = 0; x <= 5; x++) { System.out.print("+---"); }
        System.out.println("+");
    }
}
