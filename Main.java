// Main.java
// Name: Pankaj Yadav
// PRN:23070126166
// Batch: 23-27

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck(); // Creating a deck of cards
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Card");
            System.out.println("3. Find Same Suit Cards");
            System.out.println("4. Compare Two Cards");
            System.out.println("5. Find a Card");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> deck.printDeck();
                case 2 -> deck.printCard();
                case 3 -> deck.sameCard();
                case 4 -> deck.compareCard();
                case 5 -> deck.findCard();
                case 6 -> deck.dealCard();
                case 7 -> deck.shuffleDeck();
                case 8 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice, try again!");
            }
        } while (choice != 8);
        scanner.close();
    }
}

