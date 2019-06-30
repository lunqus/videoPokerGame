package videoPoker;

import java.util.*;

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
            for (int i = 0; i < 5; i++) {
                gameDeck.drawCard(dealerDeck);
            }

            while (true) {
                // Printing out the unique 5 cards
                System.out.println("Dispensed 5 Cards : ");
                System.out.print(gameDeck);

                System.out.println("Enter number of cards you want to hold: ");
                int holdArrayLength = playerInput.nextInt();
                Integer[] holdArray = new Integer[holdArrayLength]; // TODO charArr?

                System.out.println("Enter the card's positions (from 1 to 5) you want to hold: ");
                for (int i = 0; i < holdArray.length; i++) {
                    holdArray[i] = playerInput.nextInt();
                }

                System.out.println("\nHere is the position's of Cards you wanna hold: ");
                for (int num : holdArray) {
                    System.out.print(num + " ");
                }

                List<Integer> cardsPositionsToChange = new ArrayList<>(Arrays.asList(1,2,3,4,5));
                List<Integer> selectedCardsPositions = new ArrayList<>(Arrays.asList(holdArray));
                Collections.sort(selectedCardsPositions);
                cardsPositionsToChange.removeAll(selectedCardsPositions);
                Collections.reverse(cardsPositionsToChange);

                System.out.println("\nHere is the position's of Cards you wanna change: ");
                for (Integer num : cardsPositionsToChange) {
                    System.out.print(num + " ");
                }

                // Throw from gameDeck not not hold cards
                dealerDeck.backToDeck(cardsPositionsToChange, gameDeck);
                dealerDeck.shuffle();

                // Add to game gameDeck randomly generated not hold cards
                for (int i = 0; i < cardsPositionsToChange.size(); i++) {
                    gameDeck.drawCard(dealerDeck);
                }

                gameDeck.shuffle();
                System.out.println("\n\nFinally dispenced cards:");
                for (Card card : gameDeck.getCards()) {
                    System.out.print(card + " " + " ");
                }


                System.out.println("\n\nCorrect? Yes(y), No(n) ");
                boolean yesNo = playerInput.nextBoolean();

            }


        }

        if (desire == false) {

            System.out.println("It's up to you, come next time.");
        } else {
            System.out.println(" Game over! You are out of money. :( ");
        }

    }
}
