/**
 * @author Ramiyan Gangatharan
 * @since 2025-08-31
 * NOTE: IntelliJ recommended that I use a record over a class, that is why it is a record.
 * Represents a playing card with a suit and a rank.
 * <p>
 * Source/tutorial reference: <a href="https://medium.com/@ankitviddya/designing-deck-of-cards-data-structure-in-java-using-object-oriented-principles-606f1e100d06">...</a>
 * Designing a Deck of Cards in Java Using OOP Principles
 */
public record Card(Suit suit, Rank rank) {
    /**
     * Constructs a card with the specified suit and rank.
     *
     * @param suit the suit of the card (hearts, diamonds, clubs, spades)
     * @param rank the rank of the card (ace, two, ..., king)
     */
    public Card {}

    @Override public String toString() { return rank + " of " + suit; }

    public enum Suit {hearts, diamonds, clubs, spades}
    public enum Rank {ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king}
}
