import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ramiyan Gangatharan
 * @since 2025-08-31
 * Represents a standard deck of 52 playing cards.
 * This class allows creating a full deck of cards, shuffling the deck, and drawing cards one at a time. 
*/
public class Deck {
    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
        shuffle();
    }

    private void initializeDeck() {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    private void shuffle() { Collections.shuffle(cards); }

    public Card drawCard() {
        if (cards.isEmpty()) { throw new IllegalStateException("The deck is empty"); }
        return cards.remove(cards.size() - 1);
    }

    public int size() { return cards.size(); }
}
