public class Card {

    String suit;
    String rank;

    final static String[] SUITS = {"hearts", "spades", "diamonds", "clubs"};
    final static String[] RANKS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }

    public String toString(){
        return rank + " " + suit;
    }
}