public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> intList = new SinglyLinkedList<>();
        SinglyLinkedList<Vehicle> carList = new SinglyLinkedList<>();

        // Used GPT to generate test cases for me
        System.out.println("Adding items to the LinkedList...");
        intList.add(31);
        intList.add(12);
        intList.add(21);
        intList.add(44);

        System.out.println("Full List: " + intList);

        System.out.println("First item on the list: " + intList.get(0));
        System.out.println("Third item on the list: " + intList.get(2));

        // Test set()
        intList.set(1, 99);  // replace index 1 (12) with 99
        System.out.println("After setting index 1 to 99: " + intList);

        // Test remove()
        int removed = intList.remove(2);  // removes element at index 2
        System.out.println("Removed element at index 2: " + removed);
        System.out.println("List after removal: " + intList);

        // Test contains()
        System.out.println("List contains 44? " + intList.contains(44));
        System.out.println("List contains 100? " + intList.contains(100));

        // Test indexOf()
        System.out.println("Index of 44: " + intList.indexOf(44));
        System.out.println("Index of 500: " + intList.indexOf(500));

        // Test clear()
        intList.clear();
        System.out.println("List after clear(): " + intList);
        System.out.println("List size after clear(): " + intList.size());

        //**********************************************************************************

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------VEHICLE OBJECT TEST FOR LINKEDLIST -----------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------------");

        // TESTING VEHICLE LINKED LIST
        carList.add(new Vehicle("Toyota", "Corolla", "Blue", "1.8L I4", 2020, true));
        carList.add(new Vehicle("Honda", "Civic", "Red", "2.0L I4", 2018, false));
        carList.add(new Vehicle("Ford", "F-150", "Black", "3.5L V6", 2022, true));
        carList.add(new Vehicle("Tesla", "Model 3", "White", "Electric", 2021, true));
        carList.add(new Vehicle("BMW", "X5", "Silver", "3.0L I6", 2019, false));
        carList.add(new Vehicle("Chevrolet", "Camaro", "Yellow", "6.2L V8", 2017, false));
        carList.add(new Vehicle("Mercedes-Benz", "C-Class", "Grey", "2.0L Turbo", 2023, true));

        // Print the list
        System.out.println("Full Vehicle List: " + carList);

        // Test get
        System.out.println("Vehicle at index 2: " + carList.get(2));

        // Test set
        carList.set(1, new Vehicle("Hyundai", "Elantra", "Green", "1.6L I4", 2020, true));
        System.out.println("After replacing index 1: " + carList);

        // Clear
        carList.clear();
        System.out.println("List after clear(): " + carList);
    }
}