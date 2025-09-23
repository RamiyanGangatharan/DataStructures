public class ListTest {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.addToEnd(10);
        list.addToEnd(20);
        list.addToEnd(30);
        System.out.println("After addToEnd: " + list);

        list.addToFront(5);
        System.out.println("After addToFront: " + list);

        int front = list.removeFromFront();
        System.out.println("Removed from front: " + front);
        System.out.println("List: " + list);

        int back = list.removeFromEnd();
        System.out.println("Removed from end: " + back);
        System.out.println("List: " + list);

        System.out.println("Length: " + list.getLength());

        int testNumber = 20;
        boolean test = list.contains(testNumber);
        System.out.println("Contains " + testNumber + ": " + test);

        int testNumber2 = 55;
        boolean test2 = list.contains(testNumber2);
        System.out.println("Contains " + testNumber2 + ": " + test2);

        try { list.removeFromFront(); }
        catch (Exception e) { System.out.println("Expected error (removeFromFront on empty): " + e.getMessage()); }

        // ******************************************************************************************************
        // BURRITO TEST

        DoublyLinkedList<Burrito> burritos = new DoublyLinkedList<>();
        burritos.addToEnd(new Burrito("large", "steak", "white", "black beans", "salsa", true));
        burritos.addToEnd(new Burrito("small", "chicken", "brown", "brown beans", "cheese, sour cream", true));
        burritos.addToEnd(new Burrito("small", "mystery meat", "brown", "black beans", "sour cream", true));
        burritos.addToEnd(new Burrito("large", "sofritas", "white", "none", "lettuce, salsa, cheese", false));

        System.out.println("After addToEnd: " + burritos + "\n");

        Burrito frontB = burritos.removeFromFront();
        System.out.println("Removed from front: " + frontB + "\n");
        System.out.println("List: " + burritos + "\n");

        Burrito backB = burritos.removeFromEnd();
        System.out.println("Removed from end: " + backB + "\n");
        System.out.println("List: " + burritos + "\n");

        System.out.println("Length: " + burritos.getLength());
    }
}
