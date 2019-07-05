package tests;

import videoPoker.*;

public class ThreeKindTest {

    public static void main(String[] args) {

        Deck threeKindDeck = new Deck();

        Card card1, card2, card3, card4, card5;
        card1 = new Card(Suit.CLUBS, Rank.SEVEN);
        card2 = new Card(Suit.DIAMONDS, Rank.SEVEN);
        card3 = new Card(Suit.SPADES, Rank.SEVEN);
        card4 = new Card(Suit.CLUBS, Rank.KING);
        card5 = new Card(Suit.DIAMONDS, Rank.THREE);

        threeKindDeck.addCard(card1);
        threeKindDeck.addCard(card2);
        threeKindDeck.addCard(card3);
        threeKindDeck.addCard(card4);
        threeKindDeck.addCard(card5);

        Poker poker = new Poker();
        boolean threeKind = poker.isThreeKind(threeKindDeck);

        if (threeKind) {
            System.out.println("Three of a Kind !!! ");
        } else {
            System.out.println("Not Three of a Kind");
        }
    }
}
