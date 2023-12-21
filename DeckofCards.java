import java.util.*;

public class DeckofCards {
    public static void main(String[] args) {
        List<String> suits = List.of("Clubs", "Diamonds", "Hearts", "Spades");
        List<String> ranks = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Ace", "Queen", "King", "Jack");
        List<String> deck = new ArrayList<>();

        // Generating the deck of cards
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        Collections.shuffle(deck);

        int numPlayers = 4;
        int cardsPerPlayer = 9;
        String[][] playersCards = new String[numPlayers][cardsPerPlayer];

        int cardIndex = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck.get(cardIndex++);
            }
        }

        // Printing the cards for each player
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Player " + (i + 1) + " Cards:");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println(playersCards[i][j]);
            }
            System.out.println();
        }
    }
}
