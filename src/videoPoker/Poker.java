package videoPoker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Poker extends Deck {

    public static final int ROYAL_FLUSH = 800;
    public static final int STRAIGHT_FLUSH = 50;
    public static final int FOUR_OF_KIND = 25;
    public static final int FULL_HOUSE = 9;
    public static final int FLUSH = 6;
    public static final int STRAIGHT = 4;
    public static final int THREE_OF_KIND = 3;
    public static final int TWO_PAIRS = 2;
    public static final int JACKS_OR_BETTER = 1;
    public static final int ALL_OTHER = 0;

    private ArrayList<Integer> deckRanks(Deck deck) {
        List<Integer> ranksValues= new ArrayList<>();
        for (Card card : deck.getCards()) {
            ranksValues.add(card.getRankValue());
        }
        return (ArrayList<Integer>) ranksValues;
    }

    private String[] deckSuits(Deck deck) {
        String[] suits = new String[5];
        int i = 0;
        for (Card card : deck.getCards()) {
            suits[i] = card.getSuit();
            i++;
        }
        return suits;
    }

    private String[] deckRankNames(Deck deck) {
        String[] ranksNames = new String[5];
        int i = 0;
        for (Card card: deck.getCards()) {
            ranksNames[i] = card.getRank();
            i++;
        }
        return ranksNames;
    }

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

    public boolean isFourKind(Deck deck) {

        String[] ranksNames = deckRankNames(deck);
        Arrays.sort(ranksNames);
        if (ranksNames[0] == ranksNames[1] && ranksNames[1] == ranksNames[2] && ranksNames[2] == ranksNames[3] ||
                ranksNames[1] == ranksNames[2] && ranksNames[2] == ranksNames[3] && ranksNames[3] == ranksNames[4]) {
            return true;
        }
        return false;
    }

    public boolean isFullHouse(Deck deck) {

        String[] ranksNames = deckRankNames(deck);
        Arrays.sort(ranksNames);
        if (ranksNames[0] == ranksNames[1] && ranksNames[1] == ranksNames[2] && ranksNames[3] == ranksNames[4] ||
                ranksNames[0] == ranksNames[1] && ranksNames[2] == ranksNames[3] && ranksNames[3] == ranksNames[4]) {
            return true;
        }
        return false;
    }

    public boolean isFlush(Deck deck) {

        String[] suits = deckSuits(deck);
        if (suits[0] == suits[1] && suits[1] == suits[2] && suits[2] == suits[3] && suits[3] == suits[4]) {
            return true;
        }
        return false;
    }
}
