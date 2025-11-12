import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.initialStock("Apple", 100);
        store.initialStock("Orange", 40);
        store.initialStock("Banana", 20);

        System.out.println("Do we sell bananas? " + store.doWeSell("Banana"));
        System.out.println("Do we sell grapes? " + store.doWeSell("Grape"));
        System.out.println("How many oranges do we have? " + store.getQuantity("Orange"));

        System.out.println("Sell 25 oranges!");
        store.sellItems("Orange", 25);

        System.out.println("How many oranges do we have now? " + store.getQuantity("Orange"));
        System.out.println("How many apples do we have? " + store.getQuantity("Apple"));

        System.out.println("Discontinue apples!");
        store.discontinue("Apple");
        System.out.println("Do we sell apples? " + store.doWeSell("Apple"));

        System.out.println("Add DragonFruit!");
        store.addStock("Dragonfruit", 12);
        System.out.println("How many Dragonfruit do we have? " + store.getQuantity("Dragonfruit"));
    }

    public static class Store {
        static HashMap<String, Integer> inventory = new HashMap<>();

        // Adds an initial stock of a new item
        public void initialStock(String item, int quantity) { inventory.put(item, quantity); }

        // Adds more stock
        public static void addStock(String item, int quantity) { inventory.put(item, quantity); }

        // Reduces stock when items are sold
        public static void sellItems(String item, int quantity) {
            if (inventory.containsKey(item)) {
                int currentStock = inventory.get(item);
                if (currentStock >= quantity) {
                    inventory.put(item, currentStock - quantity);
                    System.out.println(quantity + " " + item + "(s) sold.");
                }
                else { System.out.println("Not enough " + item + " in stock!"); }
            }
            else { System.out.println("We don't sell " + item + "!"); }
        }

        // Returns the number of units available
        public int getQuantity(String item) { return inventory.getOrDefault(item, 0); }

        // Checks if the store sells this item
        public boolean doWeSell(String item) { return inventory.containsKey(item); }

        // Removes an item completely from the inventory
        public void discontinue(String item) { inventory.remove(item); }
    }
}
