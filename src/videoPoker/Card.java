package videoPoker;

/**
 * Card class is for card items
 */

public class Card {

    private Suit suit;
    private Rank rank;

    /**
     * @param suit
     * @param rank
     */
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getters and Setters
    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    // toString method for nicely formated string
    @Override
    public String toString() {
        return rank.toString() + " of " + suit.toString();
    }
}
