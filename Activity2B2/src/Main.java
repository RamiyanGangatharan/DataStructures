import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> story = new LinkedList<>();
        SinglyLinkedList<Vehicle> carList = new SinglyLinkedList<>();

        story.add("There");
        story.add("once");
        story.add("was");
        story.add("a");
        story.add("lady");
        story.add("who");
        story.add("lived");
        story.add("in");
        story.add("a");
        story.add("shoe.");

        System.out.println(story);

        story.add(4, "beautiful");
        System.out.println(story);
        
        story.remove(10);
        story.addLast("mansion.");
        System.out.println(story);

        System.out.println();
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