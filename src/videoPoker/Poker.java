package videoPoker;
/**
 * Poker Game Rankings
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Poker extends Deck {

    public static final int ROYAL_FLUSH = 800;
    public static final int STRAIGHT_FLUSH = 50;
    public static final int FOUR_OF_KIND = 30;
    public static final int FULL_HOUSE = 20;
    public static final int FLUSH = 15;
    public static final int STRAIGHT = 10;
    public static final int THREE_OF_KIND = 6;
    public static final int TWO_PAIRS = 3;
    public static final int PAIR = 2;

    // Method returns ArrayList of a Deck Cards Ranks Values
    private ArrayList<Integer> deckRanks(Deck deck) {
        List<Integer> ranksValues= new ArrayList<>();
        for (Card card : deck.getCards()) {
            ranksValues.add(card.getRankValue());
        }
        return (ArrayList<Integer>) ranksValues;
    }

    // Method returns String array of a Deck Cards Suits
    private String[] deckSuits(Deck deck) {
        String[] suits = new String[5];
        int i = 0;
        for (Card card : deck.getCards()) {
            suits[i] = card.getSuit();
            i++;
        }
        return suits;
    }

    // Method returns String Array of a Deck Cards Rank names
    private String[] deckRankNames(Deck deck) {
        String[] ranksNames = new String[5];
        int i = 0;
        for (Card card: deck.getCards()) {
            ranksNames[i] = card.getRank();
            i++;
        }
        return ranksNames;
    }

    /**
     * Royal flash - Ace, King, Queen, Jack, Ten all the same suit
     * @param deck - Deck of cards
     * @return boolean - method checks if Game Cards Deck meets Royal Flush
     */
    public boolean isRoyalFlush(Deck deck) {

        List<Integer> royalFlushValues = new ArrayList<>(Arrays.asList(14,13,12,11,10));
        String[] suits = deckSuits(deck);
        List<Integer> ranksValues= deckRanks(deck);

        Collections.sort(ranksValues, Collections.reverseOrder());
        if (suits[0] == suits[1] && suits[1] == suits[2] && suits[2] == suits[3] && suits[3] == suits[4]) {
            if (ranksValues.equals(royalFlushValues)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Straight Flush - Five cards in sequence, all in the same suit
     * @param deck - Deck of cards
     * @return boolean - method checks if Game Cards Deck meets Straight Flush
     */
    public boolean isStraightFlush(Deck deck) {

        String[] suits = deckSuits(deck);
        List<Integer> ranksValues= deckRanks(deck);

        Collections.sort(ranksValues, Collections.reverseOrder());
        if (suits[0] == suits[1] && suits[1] == suits[2] && suits[2] == suits[3] && suits[3] == suits[4]) {
            if ( (ranksValues.get(0) - ranksValues.get(1) == 1) && (ranksValues.get(1) - ranksValues.get(2) == 1) &&
                    (ranksValues.get(2) - ranksValues.get(3) == 1) && (ranksValues.get(3) - ranksValues.get(4) == 1) ) {
                return true;
            }
        }
        return false;
    }

    /**
     * Four of a Kind - All four cards of the same rank
     * @param deck - Deck of cards
     * @return boolean - method checks if Game Cards Deck meets Four of a Kind
     */
    public boolean isFourKind(Deck deck) {

        String[] ranksNames = deckRankNames(deck);
        String[] suits = deckSuits(deck);
        Arrays.sort(ranksNames);
        if (ranksNames[0] == ranksNames[1] && ranksNames[1] == ranksNames[2] && ranksNames[2] == ranksNames[3] ||
                ranksNames[1] == ranksNames[2] && ranksNames[2] == ranksNames[3] && ranksNames[3] == ranksNames[4]) {
            if (suits[0] != suits[1] || suits[1] != suits[2] || suits[2] != suits[3] || suits[3] != suits[4]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Full House - Three of a kind with a pair
     * @param deck - Deck of cards
     * @return boolean - method checks if Game Cards Deck meets Full House
     */
    public boolean isFullHouse(Deck deck) {

        String[] ranksNames = deckRankNames(deck);
        Arrays.sort(ranksNames);
        if (ranksNames[0] == ranksNames[1] && ranksNames[1] == ranksNames[2] && ranksNames[3] == ranksNames[4] ||
                ranksNames[0] == ranksNames[1] && ranksNames[2] == ranksNames[3] && ranksNames[3] == ranksNames[4]) {
            return true;
        }
        return false;
    }

    /**
     * Flush - Any five cards of a same suit, but not in sequence
     * @param deck - Deck of cards
     * @return boolean - method checks if Game Cards Deck meets Flush
     */
    public boolean isFlush(Deck deck) {

        String[] suits = deckSuits(deck);
        List<Integer> ranksValues= deckRanks(deck);
        Collections.sort(ranksValues, Collections.reverseOrder());
        if (suits[0] == suits[1] && suits[1] == suits[2] && suits[2] == suits[3] && suits[3] == suits[4]) {
            if ( (ranksValues.get(0) - ranksValues.get(1) != 1) || (ranksValues.get(1) - ranksValues.get(2) != 1) ||
                    (ranksValues.get(2) - ranksValues.get(3) != 1) || (ranksValues.get(3) - ranksValues.get(4) !=1) ) {
                return true;
            }
        }
        return false;
    }

    /**
     * Straight - Five cards in a sequence, but not of the same suit
     * @param deck - Deck of cards
     * @return boolean - method checks if Game Cards Deck meets Straight
     */
    public boolean isStraight(Deck deck) {

        List<Integer> ranksValues = deckRanks(deck);
        String[] suits = deckSuits(deck);
        Collections.sort(ranksValues, Collections.reverseOrder());
            if ((ranksValues.get(0) - ranksValues.get(1) == 1) && (ranksValues.get(1) - ranksValues.get(2) == 1) &&
                    (ranksValues.get(2) - ranksValues.get(3) == 1) && (ranksValues.get(3) - ranksValues.get(4) == 1)) {
                if (suits[0] != suits[1] || suits[1] != suits[2] || suits[2] != suits[3] || suits[3] != suits[4]) {
                    return true;
                }
            }
        return false;
    }

    /**
     * Three of a Kind - Three cards of the same rank
     * @param deck - Deck of cards
     * @return boolean - method checks if Game Cards Deck meets Three of a Kind
     */
    public boolean isThreeKind(Deck deck) {

        List<Integer> ranksValues = deckRanks(deck);
        String[] suits = deckSuits(deck);
        Collections.sort(ranksValues, Collections.reverseOrder());
        if (ranksValues.get(0) == ranksValues.get(1) && ranksValues.get(1) == ranksValues.get(2) ||
                ranksValues.get(1) == ranksValues.get(2) && ranksValues.get(2) == ranksValues.get(3) ||
                ranksValues.get(2) == ranksValues.get(3) && ranksValues.get(3) == ranksValues.get(4)) {
            if (suits[0] != suits[1] || suits[1] != suits[2] || suits[2] != suits[3] || suits[3] != suits[4]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Two Pair - Two different pairs
     * @param deck - Deck of cards
     * @return boolean - method checks if Game Cards Deck meets Two Pair
     */
    public boolean isTwoPair(Deck deck) {

        List<Integer> ranksValues = deckRanks(deck);
        String[] suits = deckSuits(deck);
        Collections.sort(ranksValues, Collections.reverseOrder());
        if ( (ranksValues.get(0) == ranksValues.get(1)) && (ranksValues.get(1) != ranksValues.get(2)) &&
                (ranksValues.get(2) == ranksValues.get(3)) && (ranksValues.get(3) != ranksValues.get(4)) &&
                (ranksValues.get(0) != ranksValues.get(4)) ) {
            if (suits[0] != suits[1] || suits[1] != suits[2] || suits[2] != suits[3] || suits[3] != suits[4]) {
                return true;
            }
        }
        if ( (ranksValues.get(0) == ranksValues.get(1)) && (ranksValues.get(1) != ranksValues.get(2)) &&
                (ranksValues.get(2) != ranksValues.get(3)) && (ranksValues.get(3) == ranksValues.get(4)) &&
                (ranksValues.get(0) != ranksValues.get(4)) ) {
            if (suits[0] != suits[1] || suits[1] != suits[2] || suits[2] != suits[3] || suits[3] != suits[4]) {
                return true;
            }
        }
        if ( (ranksValues.get(0) != ranksValues.get(1)) && (ranksValues.get(1) == ranksValues.get(2)) &&
                (ranksValues.get(2) != ranksValues.get(3)) && (ranksValues.get(3) == ranksValues.get(4)) &&
                (ranksValues.get(0) != ranksValues.get(4)) ) {
            if (suits[0] != suits[1] || suits[1] != suits[2] || suits[2] != suits[3] || suits[3] != suits[4]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Pair - Two cards of the same rank
     * @param deck - Deck of cards
     * @return boolean - method checks if Game Cards Deck meets Pair
     */
    public boolean isPair(Deck deck) {
        List<Integer> ranksValues = deckRanks(deck);
        String[] suits = deckSuits(deck);
        Collections.sort(ranksValues, Collections.reverseOrder());
        if ( (ranksValues.get(0) == ranksValues.get(1)) && (ranksValues.get(1) != ranksValues.get(2)) &&
                (ranksValues.get(1) != ranksValues.get(3)) && (ranksValues.get(1) != ranksValues.get(4)) ) {
            if (suits[0] != suits[1] || suits[1] != suits[2] || suits[2] != suits[3] || suits[3] != suits[4]) {
                return true;
            }
        }
        if ( (ranksValues.get(1) == ranksValues.get(2)) && (ranksValues.get(1) != ranksValues.get(0)) &&
                (ranksValues.get(1) != ranksValues.get(3)) && (ranksValues.get(1) != ranksValues.get(4)) ) {
            if (suits[0] != suits[1] || suits[1] != suits[2] || suits[2] != suits[3] || suits[3] != suits[4]) {
                return true;
            }
        }
        if ( (ranksValues.get(2) == ranksValues.get(3)) && (ranksValues.get(2) != ranksValues.get(0)) &&
                (ranksValues.get(2) != ranksValues.get(1)) && (ranksValues.get(2) != ranksValues.get(4)) ) {
            if (suits[0] != suits[1] || suits[1] != suits[2] || suits[2] != suits[3] || suits[3] != suits[4]) {
                return true;
            }
        }
        if ( (ranksValues.get(3) == ranksValues.get(4)) && (ranksValues.get(3) != ranksValues.get(0)) &&
                (ranksValues.get(3) != ranksValues.get(1)) && (ranksValues.get(3) != ranksValues.get(2)) ) {
            if (suits[0] != suits[1] || suits[1] != suits[2] || suits[2] != suits[3] || suits[3] != suits[4]) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param deck - Deck of cards
     * @return Card - Higest card from the Deck
     */
    public Card higestCard(Deck deck) {
        Card tempCard = new Card();
        tempCard = deck.getCard(0);
        for (Card card : deck.getCards()) {
            if (card.getRankValue() > tempCard.getRankValue() ) {
                tempCard = card;
            }
        }
        return tempCard;
    }
}
