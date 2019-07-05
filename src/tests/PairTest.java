package tests;

import videoPoker.*;

public class PairTest {

    public static void main(String[] args) {

        Deck pairDeck = new Deck();

        Card card1, card2, card3, card4, card5;
        card1 = new Card(Suit.HEARTS, Rank.ACE);
        card2 = new Card(Suit.DIAMONDS, Rank.ACE);
        card3 = new Card(Suit.CLUBS, Rank.EIGHT);
        card4 = new Card(Suit.SPADES, Rank.FOUR);
        card5 = new Card(Suit.HEARTS, Rank.SEVEN);

        pairDeck.addCard(card1);
        pairDeck.addCard(card2);
        pairDeck.addCard(card3);
        pairDeck.addCard(card4);
        pairDeck.addCard(card5);

        Poker poker = new Poker();
        boolean pair = poker.isPair(pairDeck);

        if (pair) {
            System.out.println("Pair !!! ");
        } else {
            System.out.println("Not Pair");
        }
    }
}
