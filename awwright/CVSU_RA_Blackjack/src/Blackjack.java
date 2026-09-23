import java.util.*;

/*
 Atendido, John Dannielle V.
 251017156
 BSCS 2-7
*/

public class Blackjack{
    static Scanner sml = new Scanner(System.in);
    static Deck deck = new Deck();
    static Hand playerHand = new Hand();
    static Hand computerHand = new Hand();
    public static void main(String[] args) {
        
        //playerHand.addCard(deck.shuffle().take());
        //playerHand.addCard(deck.shuffle().take());
        //Card baraha = new Card("ace", "spades");
        //System.out.println(value(baraha));



        playerHand.addCard(deck.shuffle().take());
        playerHand.addCard(deck.shuffle().take());
        
            // CARDS NG COMPUTER    
        computerHand.addCard(deck.shuffle().take());
        computerHand.addCard(deck.shuffle().take());

        while(true){
            System.out.println("-----------");
            System.out.println("Your hand: \n" + playerHand);
            
            System.out.print("Hit [Y/n]? ");
            String ano = sml.nextLine().toLowerCase();

            switch(ano){
                case "y":
                    playerHand.addCard(deck.shuffle().take());

                    if (handValue(playerHand) > 21){
                        System.out.println("Your hand: \n" + playerHand);
                        
                        for (int q = 0; q < playerHand.cards.size()-2; q++){
                             deck.put(playerHand.cards.get(q));
                            playerHand.removeCard(playerHand.cards.get(q));
                        }

                        for (int q = 0; q < computerHand.cards.size()-2; q++){
                             deck.put(playerHand.cards.get(q));
                            computerHand.removeCard(computerHand.cards.get(q));
                        }

                        System.out.println("You busted!\n");
                        return;
                    }
                    break;
                    
                case "n":

                    if (handValue(playerHand) > handValue(computerHand)){
                        System.out.println("You beat the computer!\n");
                        System.out.println("\nComputer Hand: \n" + computerHand);
                    }

                    else if (handValue(computerHand) > handValue(playerHand)){
                        System.out.println("\nComputer Hand: \n" + computerHand);
                        System.out.println("You lost!\n");
                    }
                    else{
                        System.out.println("Tie!\n");
                    }

                    for (int q = 0; q < playerHand.cards.size()-2; q++){
                            deck.put(playerHand.cards.get(q));
                            playerHand.removeCard(playerHand.cards.get(q));
                        }

                    for (int q = 0; q < computerHand.cards.size()-2; q++){
                        deck.put(playerHand.cards.get(q));
                        computerHand.removeCard(computerHand.cards.get(q));
                    }
                    return;

                default:
                    System.out.println("\n1ERROR!!\n");
                    break;
            }
        }
    }

    //value(playerHand.cards)
    //handValue(value(playerHands.cards))
    static int value(Card card){
        
        int value = 0;

        if (card.toString().contains("ace")){
            value = 1;
        }

        else if (card.toString().contains("2")){
            value = 2;
        }

        else if (card.toString().contains("3")){
            value = 3;
        }

        else if (card.toString().contains("4")){
            value = 4;
        }

        else if (card.toString().contains("5")){
            value = 5;
        }

        else if (card.toString().contains("6")){
            value = 6;
        }

        else if (card.toString().contains("7")){
            value = 7;
        }

        else if (card.toString().contains("8")){
            value = 8;
        }

        else if (card.toString().contains("9")){
            value = 9;
        }

        else if (card.toString().contains("10") || card.toString().contains("jack") || card.toString().contains("queen") || card.toString().contains("king")){
            value = 10;
        }

        else{
            System.out.println("2ERROR!\n");
        }

        return value;
    }

    static int handValue(Hand hand){

        int handVal = 0;
        int val;

        for(Card kamay : hand.cards){
            val = value(kamay);
            handVal += val;
        }

        return handVal;
    }
}