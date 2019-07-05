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

    public Card(){}

    // Getters and Setters
    public String getSuit() {
        return suit.getSuit();
    }

    public String getRank() {
        return rank.getRank();
    }

    public int getRankValue() {
        return rank.getRankValue();
    }

    // toString method for nicely formated string
    @Override
    public String toString() {
        return rank.getRank().toString() + " " + suit.getSuit().toString() + " ";
    }
}
