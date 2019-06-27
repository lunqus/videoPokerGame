package videoPoker;

import java.util.Scanner;

/**
 * Main class with main methods
 */

public class VideoPoker {

    public static void main(String[] args) {

        System.out.println("\n === Welcome to Video Poker Game! === \n ------------------------------------ \n\n");

        Deck dealerDeck = new Deck();
        dealerDeck.populateDeck();
        dealerDeck.shuffle();
        System.out.println("DEALER DECK of CARDS: \n");
        System.out.println(dealerDeck);

        // Create a game deck of cards
        Deck gameDeck = new Deck();
        double playerFunds = 100.00;
        double playerBet = 10.00;
        boolean desire = true;
        boolean gameStarted = false;

        Scanner playerInput = new Scanner(System.in);

        /*      GAME LOOP
        *   Every time the player has a turn
        *   it's gonna run through the loop once,
        *   until player has a money
        */

        while (playerFunds > playerBet) {
            if (gameStarted == false) {
                System.out.println("Would you like to start the game: YES(1) NO(2) ?");
                int response = playerInput.nextInt();
                    if (response == 2) {
                        desire = false;
                        break;
                    }
            }
            gameStarted = true;

            // After player desided to play, player fund decreasing by bet amount of €
            System.out.println("You have €" + playerFunds);
            playerFunds -= playerBet;
            System.out.println("Your funds after bet €" + playerFunds);

            if (playerBet > playerFunds) {
                System.out.println("You can't bet more than you have. Game Over :(");
                break;
            }

            boolean endRound = false;

            // Start dealing - Game Deck (Five cards)
            gameDeck.drawCard(dealerDeck);
            gameDeck.drawCard(dealerDeck);
            gameDeck.drawCard(dealerDeck);
            gameDeck.drawCard(dealerDeck);
            gameDeck.drawCard(dealerDeck);

            while (true) {
                System.out.println("Here is a five Cards " + gameDeck.toString());
                break;
            }


        }

        if (desire == false) {

            System.out.println("It's up to you, come next time.");
        } else {
            System.out.println(" Game over! You are out of money. :( ");
        }

    }
}
