class Card {
    String suit, rank;
    Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public String toString() {
        return rank + " of " + suit;
    }
}

