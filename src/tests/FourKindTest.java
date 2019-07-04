package tests;

import videoPoker.*;

public class FourKindTest {

    public static void main(String[] args) {

        Deck fourKindDeck = new Deck();

        Card card1, card2, card3, card4, card5;
        card1 = new Card(Suit.HEARTS, Rank.JACK);
        card2 = new Card(Suit.DIAMONDS, Rank.JACK);
        card3 = new Card(Suit.SPADES, Rank.JACK);
        card4 = new Card(Suit.CLUBS, Rank.JACK);
        card5 = new Card(Suit.DIAMONDS, Rank.SEVEN);

        fourKindDeck.addCard(card1);
        fourKindDeck.addCard(card2);
        fourKindDeck.addCard(card3);
        fourKindDeck.addCard(card4);
        fourKindDeck.addCard(card5);

        Poker poker = new Poker();
        boolean fourKind = poker.isFourKind(fourKindDeck);

        if (fourKind) {
            System.out.println("Four a Kind !!! ");
        } else {
            System.out.println("Not not Four a Kind");
        }

    }
}
