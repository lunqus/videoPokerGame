package videoPoker;

/**
 *  enum Rank Class it's a special datatype that is used
 *  for constants in program
 *  Ranks are always gonna be only:
 *  ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
 *  we can use an enum because those are going to be constant
 */

public enum Rank {

    TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"),
    SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"),
    JACK("J"), QUEEN("Q"), KING("K"), ACE("A");

    private final String rank;

    Rank(String rank) {
        this.rank = rank;
    }

    // Getters
    public String getRank() {
        return rank;
    }
}
