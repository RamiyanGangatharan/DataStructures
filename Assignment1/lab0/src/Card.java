/**
 * @author Ramiyan Gangatharan
 * @since 2025-08-31
 * <p>
 * Basically, I have done this program many times in Durham College to prototype card games and create a larger
 * scale implementation for an OOP III final project. This is purely a small card creator and shuffler following the
 * tutorial below.
 * <p>
 * Source: <a href="https://medium.com/@ankitviddya/designing-deck-of-cards-data-structure-in-java-using-object-oriented-principles-606f1e100d06">...</a>
 */
public class Card {
    private final Suit suit;
    private final Rank rank;

    /**
     * @param suit what kind of card it is
     * @param rank the power or authority a card has over another
     */
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() { return suit; }
    public Rank getRank() { return rank; }

    @Override
    public String toString() { return rank + " of " + suit; }

    public enum Suit {hearts, diamonds, clubs, spades}

    public enum Rank {ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king}
}

