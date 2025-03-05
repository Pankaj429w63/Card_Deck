class Deck {
    private ArrayList<Card> cards;
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private Scanner scanner = new Scanner(System.in);
    
    Deck() {
        createDeck();
    }

    public void createDeck() {
        cards = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void printCard() {
        System.out.print("Enter card index (0-51): ");
        int index = scanner.nextInt();
        if (index >= 0 && index < cards.size()) {
            System.out.println(cards.get(index));
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void sameCard() {
        System.out.print("Enter suit: ");
        String suit = scanner.next();
        for (Card card : cards) {
            if (card.suit.equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }

    public void compareCard() {
        System.out.print("Enter rank: ");
        String rank = scanner.next();
        for (Card card : cards) {
            if (card.rank.equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }

    public void findCard() {
        System.out.print("Enter suit and rank (e.g., Hearts Ace): ");
        String suit = scanner.next();
        String rank = scanner.next();
        boolean found = false;
        for (Card card : cards) {
            if (card.suit.equalsIgnoreCase(suit) && card.rank.equalsIgnoreCase(rank)) {
                System.out.println("Card found: " + card);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Card not found.");
    }

    public void dealCard() {
        Collections.shuffle(cards);
        for (int i = 0; i < 5; i++) {
            System.out.println(cards.get(i));
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
        System.out.println("Deck shuffled!");
    }
}

