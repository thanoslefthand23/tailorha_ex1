package exercise1;

/* 
   @author tailorha
   @author harsh tailor 30th may 2023

*/
import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];

        // Fill the hand with random cards
        Random random = new Random();
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        // Print out the generated cards (for debugging purposes)
        System.out.println("Generated cards:");
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println();

        // Ask the user to pick a card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your card value (1-13): ");
        int value = scanner.nextInt();
        System.out.print("Enter your card suit (0-3): ");
        int suit = scanner.nextInt();

        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit]);

        // Search the hand for a match
        boolean foundMatch = false;
        for (Card card : hand) {
            if (card.equals(userCard)) {
                foundMatch = true;
                break;
            }
        }

        // Print the result
        if (foundMatch) {
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the hand.");
        }
    }

    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        }
}

