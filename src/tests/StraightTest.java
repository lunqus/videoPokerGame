package tests;

import videoPoker.*;

public class StraightTest {

    public static void main(String[] args) {

        Deck straightDeck = new Deck();

        Card card1, card2, card3, card4, card5;
        card1 = new Card(Suit.CLUBS, Rank.NINE);
        card2 = new Card(Suit.DIAMONDS, Rank.EIGHT);
        card3 = new Card(Suit.SPADES, Rank.SEVEN);
        card4 = new Card(Suit.DIAMONDS, Rank.SIX);
        card5 = new Card(Suit.HEARTS, Rank.FIVE);

        straightDeck.addCard(card1);
        straightDeck.addCard(card2);
        straightDeck.addCard(card3);
        straightDeck.addCard(card4);
        straightDeck.addCard(card5);

        Poker poker = new Poker();
        boolean straight = poker.isStraight(straightDeck);

        if (straight) {
            System.out.println("Straight !!! ");
        } else {
            System.out.println("Not not a Straight");
        }
    }
}
