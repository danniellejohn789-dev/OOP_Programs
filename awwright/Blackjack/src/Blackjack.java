import java.util.*;

public class Blackjack{
    static Scanner sml = new Scanner(System.in);
    static Deck deck = new Deck();
    static Hand playerHand = new Hand();
    static Hand computerHand = new Hand();
    public static void main(String[] args) {
        
        playerHand.addCard(null)
        while(true){
            System.out.println("Your hand: " + playerHand.addCard(deck.shuffle().take()));
        }

    }

    static int value(Card card){
        return 1;
    }

    static int handValue(Hand hand){
        return 1;
    }
}