import java.util.*;

/*
 Atendido, John Dannielle V.
 251017156
 BSCS 2-7
*/

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();
    
    Deck(){
        for(String suit : Card.SUITS){
            for(String rank : Card.RANKS){
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
        this.cards.add(card);
        return this;
    }

    public String toString(){
        String baraha = " ";
        for (Card barahas : cards){
            baraha += barahas + "\n";
        }
        return baraha;
    }
}

