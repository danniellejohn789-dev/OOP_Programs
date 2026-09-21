import java.util.*;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();
    
    Deck(){
        for(String suit : Card.RANKS){
            for(String rank : Card.SUITS){
                Card newCard = new Card(suit, rank);
                cards.add(newCard);
            }
        }
    }

    Deck shuffle(){
        Collections.shuffle(this.cards);
        return this;
    }
    
    Card take(){
        Card baraha = cards.remove(0);
        return baraha;

    }

    Deck put(Card card){

    }

    public String toString(){
        String baraha = " ";
        for (Card barahas : cards){
            baraha += barahas + "\n";
        }
        return baraha;
    }
}

