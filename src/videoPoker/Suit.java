package videoPoker;

/**
 *  enum Suit Class it's a special datatype that is used
 *  for constants in program
 *  Cards are always gonna be only: CLUBS, DIAMONDS, SPADES & HEARTS
 *  we can use an enum because those are going to be constant
 */

public enum Suit {

    CLUBS("♣Clubs"), DIAMONDS("♦Diamonds"), SPADES("♠Spades"), HEARTS("♥Hearts");

    private final String suit;

    // Constructor
    Suit(String suit) {
        this.suit = suit;
    }

    // Getters

    public String getSuit() {
        return suit;
    }
}
