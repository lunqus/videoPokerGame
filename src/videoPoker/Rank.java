package videoPoker;

/**
 *  enum Rank Class it's a special datatype that is used
 *  for constants in program
 *  Ranks are always gonna be only:
 *  ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
 *  we can use an enum because those are going to be constant
 */

public enum Rank {

    TWO("Deuce", 2), THREE("Three", 3), FOUR("Four",4), FIVE("Five",5),
    SIX("Six", 6), SEVEN("Seven", 7), EIGHT("Eight",8), NINE("Nine", 9),
    TEN("Ten", 10), JACK("Jack", 11), QUEEN("Queen", 12), KING("King", 13),
    ACE("Ace", 14);

    private final String rank;
    private final int rankValue;

    Rank(String rank, int rankValue) {
        this.rank = rank;
        this.rankValue = rankValue;
    }

    // Getters
    public String getRank() {
        return rank;
    }
    public int getRankValue() {
        return rankValue;
    }
}
