package tests;

import videoPoker.*;

public class FlushTest {

    public static void main(String[] args) {

        Deck flushDeck = new Deck();

        Card card1, card2, card3, card4, card5;
        card1 = new Card(Suit.SPADES, Rank.FOUR);
        card2 = new Card(Suit.SPADES, Rank.JACK);
        card3 = new Card(Suit.SPADES, Rank.EIGHT);
        card4 = new Card(Suit.SPADES, Rank.TWO);
        card5 = new Card(Suit.SPADES, Rank.NINE);

        flushDeck.addCard(card1);
        flushDeck.addCard(card2);
        flushDeck.addCard(card3);
        flushDeck.addCard(card4);
        flushDeck.addCard(card5);

        Poker poker = new Poker();
        boolean flush = poker.isFlush(flushDeck);

        if (flush) {
            System.out.println("Flush !!! ");
        } else {
            System.out.println("Not not a Flush");
        }
    }
}
