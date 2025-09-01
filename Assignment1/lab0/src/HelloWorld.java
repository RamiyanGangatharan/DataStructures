import java.text.DecimalFormat;
import java.util.Scanner;

public class HelloWorld {
    /**
     * @author Ramiyan Gangatharan
     * @since 2025-08-31
     * This is my first program in the course of Data Structures at Ontario Tech University.
     * I have previous programming experience at Durham College, and creating a card deck
     * is a way for me to demonstrate that I understand the basics of a language like Java,
     * including variables, loops, conditionals, and object-oriented concepts.
     * In extension to this, I will be creating a card deck programmatically in another file.
     */
    public static void main(String[] args) {

        System.out.println("\n\nHello world!");

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Initialize the card deck
        Deck deck = new Deck();

        boolean hasAce = false;
        double aceChance = 4.0 / deck.size();

        System.out.println("Deck Size: " + deck.size());
        System.out.println("Chance of drawing an Ace first: " + df.format(aceChance));
        System.out.println("-----------------------");

        System.out.print("How many cards to draw?: ");
        int drawAmount = scanner.nextInt();
        int drawn = 0;


        while (drawn < drawAmount) {
            Card card = deck.drawCard();
            System.out.println("Card Drawn: " + card);
            if (card.rank() == Card.Rank.ace) { hasAce = true; }
            drawn++;
        }

        scanner.close();
        System.out.println("-----------------------");

        if (hasAce) { System.out.println("This hand of cards has an Ace in it!"); }

        System.out.println("Deck size after drawing out " + drawAmount + " cards: " + deck.size());

        // check deck status
        if (deck.size() > 40) { System.out.println("Deck is mostly full"); }
        else if (deck.size() > 26) { System.out.println("Deck is 3/4 full"); }
        else if (deck.size() == 26) { System.out.println("Deck is half-empty"); }
        else if (deck.size() > 13) { System.out.println("Deck is 1/4 full"); }
        else { System.out.println("Deck is running low!"); }
    }
}
