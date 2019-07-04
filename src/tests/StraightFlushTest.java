package tests;

import videoPoker.*;

public class StraightFlushTest {

    public static void main(String[] args) {

        Deck straightFlushDeck = new Deck();

        Card card1, card2, card3, card4, card5;
        card1 = new Card(Suit.DIAMONDS, Rank.EIGHT);
        card2 = new Card(Suit.DIAMONDS, Rank.SEVEN);
        card3 = new Card(Suit.DIAMONDS, Rank.SIX);
        card4 = new Card(Suit.DIAMONDS, Rank.FIVE);
        card5 = new Card(Suit.DIAMONDS, Rank.FOUR);

        straightFlushDeck.addCard(card1);
        straightFlushDeck.addCard(card2);
        straightFlushDeck.addCard(card3);
        straightFlushDeck.addCard(card4);
        straightFlushDeck.addCard(card5);

        Poker poker = new Poker();
        boolean straightFlush = poker.isStraightFlush(straightFlushDeck);

        if (straightFlush) {
            System.out.println("Straight Flush !!!");
        } else {
            System.out.println("Not Straight Flush");
        }
    }
}
