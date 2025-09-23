public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> intList = new SinglyLinkedList<>();
        System.out.println("Full List: " + intList);
        System.out.println("3rd index: " + intList.get(3));

        System.out.println("Adding items to the LinkedList...");
        intList.add(31);
        System.out.println("Current List: " + intList);
        intList.add(12);
        System.out.println("Current List: " + intList);
        intList.add(21);
        System.out.println("Current List: " + intList);
        intList.add(44);

        System.out.println("Full List: " + intList);

        System.out.println("First item on the list: " + intList.get(0));
        System.out.println("Third item on the list: " + intList.get(2));

    }
}