import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // This is a code along tutorial
        Point p1 = new Point(0,5);
        System.out.println("Original Point: " + printPoint(p1));

        p1.translate(50,-7000);
        System.out.println("New Point: " + printPoint(p1));

        System.out.println("------------------------------------------");
        System.out.println("Activity 1B1");
        System.out.println("------------------------------------------");

        Point p2 = new Point(0,0);
        Point p3 = new Point(1,3);
        Point p4 = new Point(2,2);
        Point p5 = new Point(4,4);
        Point p6 = new Point(3,1);

        Activity1B1.grid(p2, p3, p4, p5, p6);
    }

    /**
     * String Formatting
     * @param p
     * @return
     */
    public static String printPoint(Point p) {
        return "(" + (int)p.getX() + ", " + (int)p.getY() + ")";
    }
}