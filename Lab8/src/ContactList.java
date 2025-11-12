import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A class representing a contact list that allows for multiple
 * contact methods (e.g., phone numbers) per name.

 */
public class ContactList {
    private final Map<String, List<ContactMethod>> contacts;

    /*
     *  BELOW ARE THE METHODS FOR PART 1
     *
     */

    /**
     * Constructor to initialize the contact list.
     *  *
     *  * ----------------public ContactList() - the Constructor for the ContactList,
     *  *  which should create the underlying HashMap------------
     */
    public ContactList() {
        contacts = new HashMap<>();
    }
//
//    public ContactList(String, List<ContactMethod>) {
//        HashMap<String, List<ContactMethod>> contacts = new HashMap<>();
//    }

    /**
     * Adds a contact method (e.g., phone number) to the contact
     * list for the given name.
     *
     * -----------public void addContactMethod(String name, String method,
     * String value) - a method to add a contact method to your
     * ContactList.-----------------
     *
     * @param name   The name of the contact.
     * @param method The type of contact method
     *               (e.g., "phone", "email").
     * @param value  The value of the contact method
     *               (e.g., the actual phone number or email address).
     */
    public void addContactMethod(String name, String method, String value) {
        List<ContactMethod> contactMethods = contacts.getOrDefault(name, new ArrayList<>());
        contactMethods.add(new ContactMethod(method, value));
        contacts.put(name, contactMethods);
    }

    /**
     * Gets the number of contacts in the contact list.
     *
     * ----------------public int getSize() -
     * returns how many contacts you have in the ContactList-----------
     *
     * @return The number of contacts.
     */
    public int getSize() {
        return contacts.size();
    }

    public void printContacts() {
        System.out.println("All contacts: (" + contacts.size() + ")\n");


        for (String name: contacts.keySet()) {
            System.out.println(name + ": ");
            for(ContactMethod c: contacts.get(name)) {
                System.out.println("       " + c.getMethod() + ": " + c.getValue());
            }
        }
        //spacer
        System.out.println();

    }
    //        HashMap<String, List<ContactMethod>> contacts = new HashMap<>();

    /**
     * Retrieves the list of contact methods for the given name.
     *
     * ----------------public List<ContactMethod> getContactMethods(String name)
     * - a method that returns all ContactMethods in a list for
     * the given contact name.-----------------
     *
     * @param name The name of the contact.
     * @return The list of contact methods, or null if the contact does not exist.
     */
    public List<ContactMethod> getContactMethods(String name) {
        return contacts.getOrDefault(name, new ArrayList<>());
    }

    /*
     *  BELOW ARE THE METHODS FOR PART 2
     *
     */


    /**
     * Checks if the contact list contains a contact with the given name.
     *
     * @param name The name to check.
     * @return True if the contact list contains the name, false otherwise.
     */
    public boolean containsContact(String name) {
        // TODO: Implement this method
        return contacts.containsKey(name);
    }

    /**
     * Removes a specific contact method (e.g., phone number) from the contact list for the given name.
     *
     * @param name   The name of the contact.
     * @param method The type of contact method to remove.
     * @param value  The value of the contact method to remove.
     */
    public void removeContactMethod(String name, String method, String value) {
        if (!contacts.containsKey(name)) {
            return;
        }

        List<ContactList.ContactMethod> contactMethods = contacts.getOrDefault(name, new ArrayList<>());

        for (int i = contactMethods.size() - 1; i >=0; i--) {
            if ()
        }

    }

    /**
     * A class representing a single contact method.
     */
    public static class ContactMethod {
        private final String method;
        private final String value;

        /**
         * Constructs a contact method with the specified method and value.
         *
         * @param method The type of contact method (e.g., "phone", "email").
         * @param value  The value of the contact method (e.g., the actual phone number or email address).
         */
        public ContactMethod(String method, String value) {
            this.method = method;
            this.value = value;
        }

        /**
         * Gets the contact method.
         *
         * @return The contact method.
         */
        public String getMethod() {
            return method;
        }

        /**
         * Gets the contact value.
         *
         * @return The contact value.
         */
        public String getValue() {
            return value;
        }

        /**
         * Returns a string representation of the contact method.
         *
         * @return The string representation of the contact method.
         */
        @Override
        public String toString() {
            return method + ": " + value;
        }
    }

    /**
     * Main method to test the ContactList class.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Create a new contact list
        ContactList contacts = new ContactList();
        List<ContactMethod> cmForName = new ArrayList<>();

        //0
        System.out.println("-----------1: empty-----------");
        contacts.printContacts();
        System.out.println();

        //1
        System.out.println("-----------2: add contact method-----------");
        contacts.addContactMethod("Bob", "cell phone", "987-654-3210");
        contacts.printContacts();
        System.out.println();

        //1.2
        System.out.println("-----------2.1: add contact method-----------");
        contacts.addContactMethod("Bob", "work phone", "1-888-234-8797 ext 667");
        contacts.printContacts();
        System.out.println();

        //2
        System.out.println("-----------3: add another contact and more contact methods-----------");
        contacts.addContactMethod("Alice", "cell phone", "123-456-7890");
        contacts.addContactMethod("Alice", "email", "alice@example.com");
        contacts.addContactMethod("Alice", "instagram", "@AlicesAdventures");
        contacts.printContacts();
        System.out.println();

        //2.1 add third
        System.out.println("-----------3.1: add another contact and more contact methods-----------");
        contacts.addContactMethod("Charlie", "cell phone", "555-555-5555");
        contacts.printContacts();
        System.out.println();

        System.out.println("-----------4: get all methods for alice-----------");
        cmForName = contacts.getContactMethods("Alice");
        System.out.println("Alice: ");
        System.out.print(cmForName);

        System.out.println();
        System.out.println("Does Alice exist in contacts: " + contacts.containsContact("Alice"));

        System.out.println();
        System.out.println("Removing Alice's email address " + contacts.getContactMethods("Alice"));
        contacts.removeContactMethod("Alice", "email", "alice@example.com");
        System.out.println("after: " + contacts.getContactMethods("Alice"));

    }
}
