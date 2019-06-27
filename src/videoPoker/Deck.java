package videoPoker;

import java.util.ArrayList;
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
//        cards.add(deckFrom.getCard(0));
        deckFrom.removeCard(0);
    }

    /* Getters and Setters */

    public void removeCard(int i) {
        cards.remove(i);
    }

    public Card getCard(int i) {
        return cards.get(i);
    }

    public void addCard(Card addCard) {
        cards.add(addCard);
    }

    // toString method for nicely formated string
    @Override
    public String toString() {
        String outputCards = "";
        int i = 1;
        for (Card card : cards) {
            outputCards += card.toString() + "\n";
            i++;
        }
        return outputCards;
    }
}
