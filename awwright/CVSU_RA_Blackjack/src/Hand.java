import java.util.*;

/*
 Atendido, John Dannielle V.
 251017156
 BSCS 2-7
*/

public class Hand {

    ArrayList<Card> cards = new ArrayList<>();

    Hand addCard(Card card){
        cards.add(card);
        return this;
    }
    
    Hand removeCard(Card card){
        cards.remove(indexOfCard(card));
        return this;
    }

    int indexOfCard(Card card){
        int index = this.cards.indexOf(card);
        return index;
    }

    public String toString(){
        String barahaKo = "";
        for(Card baraha : cards){
            barahaKo += baraha + "\n";
        }
        return barahaKo;
    }
}