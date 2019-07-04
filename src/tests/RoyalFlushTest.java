package tests;

import videoPoker.*;

public class RoyalFlushTest {

    public static void main(String[] args) {

        Deck royalFlushDeck = new Deck();

        Card card1, card2, card3, card4, card5;
        card1 = new Card(Suit.CLUBS, Rank.ACE);
        card2 = new Card(Suit.CLUBS, Rank.KING);
        card3 = new Card(Suit.CLUBS, Rank.QUEEN);
        card4 = new Card(Suit.CLUBS, Rank.JACK);
        card5 = new Card(Suit.CLUBS, Rank.TEN);

        royalFlushDeck.addCard(card1);
        royalFlushDeck.addCard(card2);
        royalFlushDeck.addCard(card3);
        royalFlushDeck.addCard(card4);
        royalFlushDeck.addCard(card5);

        Poker poker = new Poker();
        boolean result = poker.isRoyalFlush(royalFlushDeck);

        if (result) {
            System.out.println("Royal Flash !!!");
        } else {
            System.out.println("Not royal flush");
        }

    }


}
