/**
 * @author Ramiyan Gangatharan
 * @since 2025-08-31
 * Represents a playing card with a suit and a rank.
 * 
 * Source/tutorial reference: 
 * https://medium.com/@ankitviddya/designing-deck-of-cards-data-structure-in-java-using-object-oriented-principles-606f1e100d06
 * Designing a Deck of Cards in Java Using OOP Principles
 */
public class Card {
    private final Suit suit;
    private final Rank rank;

    public enum Suit {hearts, diamonds, clubs, spades}
    public enum Rank {ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king}

    /**
     * Constructs a card with the specified suit and rank.
     *
     * @param suit the suit of the card (hearts, diamonds, clubs, spades)
     * @param rank the rank of the card (ace, two, ..., king)
     */
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() { return suit; }
    public Rank getRank() { return rank; }

    @Override
    public String toString() { return rank + " of " + suit; }
}
