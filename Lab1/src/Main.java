public class Main {
    public static void main(String[] args) {

        // Custom burritos for the lab requirements
        burritoOrder order1 = new burritoOrder(
                "large",
                "steak",
                "brown",
                "black",
                "cheese, sour cream",
                true
        );
        burritoOrder order2 = new burritoOrder(
                "small",
                "sofritas",
                "white",
                "none",
                "lettuce, salsa, cheese",
                false
        );
        burritoOrder order3 = new burritoOrder(
                "large",
                "chicken",
                "no rice",
                "brown",
                "corn salsa",
                true
        );

        burritoOrder order4 = new burritoOrder(
                "large",
                "chicken",
                "white",
                "brown",
                "cheese",
                false
        );

        burritoOrder order5 = new burritoOrder(
                "small;",
                "chicken",
                "white",
                "black",
                "salsa",
                true
        );

        burritoOrder order6 = new burritoOrder(
                "large",
                "steak",
                "no rice",
                "brown",
                "sour cream",
                true
        );

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);
        System.out.println(order5);
        System.out.println(order6);
    }
}