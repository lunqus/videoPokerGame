package tests;

import videoPoker.*;

public class TwoPairTest {

    public static void main(String[] args) {

        Deck twoPairDeck = new Deck();

        Card card1, card2, card3, card4, card5;
        card1 = new Card(Suit.CLUBS, Rank.FOUR);
        card2 = new Card(Suit.SPADES, Rank.FOUR);
        card3 = new Card(Suit.CLUBS, Rank.THREE);
        card4 = new Card(Suit.DIAMONDS, Rank.THREE);
        card5 = new Card(Suit.CLUBS, Rank.QUEEN);

        twoPairDeck.addCard(card1);
        twoPairDeck.addCard(card2);
        twoPairDeck.addCard(card3);
        twoPairDeck.addCard(card4);
        twoPairDeck.addCard(card5);

        Poker poker = new Poker();
        boolean twoPair = poker.isTwoPair(twoPairDeck);

        if (twoPair) {
            System.out.println("Two Pair !!! ");
        } else {
            System.out.println("Not Two Pair");
        }
    }
}
