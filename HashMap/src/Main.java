import java.util.HashMap;

public class Main {
    public static class Monster {
        String name;
        Boolean undead;
        int age;

        public Monster(String name, boolean undead, int age) {
            this.name = name;
            this.undead = undead;
            this.age = age;
        }

        @Override public String toString() {
            return age + " year old " + (undead ? "undead":"living") + " monster named " + name;
        }
    }
    public static void main(String[] args) {

        HashMap<String, Monster> monsters = new HashMap<>();
        monsters.put("ex-human", new Monster("Frankenstein", true, 3));
        monsters.put("Vampire", new Monster("Dracula", true, 2000));
        monsters.put("Werewolf", new Monster("Jacob", false, 456));

        System.out.println("The number of monsters in this hashmap: " + monsters.size());
        monsters.put("Werewolf", new Monster("Jacob", false, 17));

        System.out.println("The number of monsters in this hashmap after modification: " + monsters.size());
        System.out.println(monsters.get("Werewolf"));
    }
}