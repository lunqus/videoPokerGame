package videoPoker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Deck class gonna be holding all the Decks
 */

public class Deck {

    // Attributes
    private ArrayList<Card> cards;

    // Constructor
    public Deck() {
        cards = new ArrayList<>();
    }

    /* Instance methods */

    // Deck population method
    public void populateDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    // Shuffle the Deck method do go randomly throught the deck of cards
    public void shuffle() {
        ArrayList<Card> tempDeck = new ArrayList<>();
        Random rand = new Random();
        int deckSize = cards.size();
        for (int i = 0; i < deckSize; i++) {
            int randIndex = rand.nextInt(cards.size());
            tempDeck.add(cards.get(randIndex));
            cards.remove(randIndex);
        }
        cards = tempDeck;
    }

    // Method to draw card from the deck in order to move card from one deck to another
    public void drawCard(Deck deckFrom) {
        Random rand = new Random();
//        int randIndex = rand.nextInt(deckFrom.cards.size()); //TODO draw random card
        cards.add(deckFrom.getCard(0));
        deckFrom.removeCard(0);
    }

    public void backToDeck(List<Integer> cardsPositionsToChange, Deck deckFrom) {
        for (Integer num : cardsPositionsToChange) {
            if (num == 5) {
                cards.add(deckFrom.getCard(4));
                deckFrom.removeCard(4);
            }
            if (num == 4) {
                cards.add(deckFrom.getCard(3));
                deckFrom.removeCard(3);
            }
            if (num == 3) {
                cards.add(deckFrom.getCard(2));
                deckFrom.removeCard(2);
            }
            if (num == 2) {
                cards.add(deckFrom.getCard(1));
                deckFrom.removeCard(1);
            }
            if (num == 1) {
                cards.add(deckFrom.getCard(0));
                deckFrom.removeCard(0);
            }
        }
    }

    public int handRank(int i) {
        int handValue = 0;
        for (Card card : cards) {

        }
        return handValue;
    }

    /* Getters and Setters */

    public void removeCard(int i) {
        cards.remove(i);
    }

    public void addCard(Card addCard) {
        cards.add(addCard);
    }

    public Card getCard(int i) {
        return cards.get(i);
    }

    public ArrayList<Card> getCards() {
        ArrayList<Card> tempArray = new ArrayList<>();
        for (Card card : cards) {
            tempArray.add(card);
        }
        return tempArray;
    }

    // toString method for nicely formated string
    @Override
    public String toString() {
        String outputCards = "";
        int i = 1;
        for (Card card : cards) {
            outputCards += i + ". " + card.toString() + "\n";
            i++;
        }
        return outputCards;
    }
}
