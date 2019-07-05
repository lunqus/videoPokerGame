package tests;

import videoPoker.*;

public class FullHouseTest {

    public static void main(String[] args) {

        Deck fullHouseDeck = new Deck();

        Card card1, card2, card3, card4, card5;
        card1 = new Card(Suit.HEARTS, Rank.TEN);
        card2 = new Card(Suit.DIAMONDS, Rank.TEN);
        card3 = new Card(Suit.SPADES, Rank.TEN);
        card4 = new Card(Suit.CLUBS, Rank.NINE);
        card5 = new Card(Suit.DIAMONDS, Rank.NINE);

        fullHouseDeck.addCard(card1);
        fullHouseDeck.addCard(card2);
        fullHouseDeck.addCard(card3);
        fullHouseDeck.addCard(card4);
        fullHouseDeck.addCard(card5);

        Poker poker = new Poker();
        boolean fullHouse = poker.isFullHouse(fullHouseDeck);

        if (fullHouse) {
            System.out.println("Full House !!! ");
        } else {
            System.out.println("Not not a Full House");
        }
    }
}
