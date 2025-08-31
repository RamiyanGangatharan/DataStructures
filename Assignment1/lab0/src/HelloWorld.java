public class HelloWorld {
    /**
     * @author Ramiyan Gangatharan
     * @since 2025-08-31
     * This is my first program in the course of Data Structures at Ontario Tech University.
     * In extension to this, I will be creating a card deck programmatically in another file.
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // This is the card deck implementation
        Deck deck = new Deck();

        System.out.println("Deck Size: " + deck.size());

        for (int i = 0; i < 5; i++) {
            Card card = deck.drawCard();
            System.out.println("Card Drawn: " + card);
        }

        System.out.println("Deck size after drawing out 5 cards: " + deck.size());
    }
}

