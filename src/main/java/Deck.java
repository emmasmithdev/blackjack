import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;
    private Random randomGenerator;

    public Deck() {
        this.cards = new ArrayList<>();
        this.randomGenerator = new Random();
        populate();
    }


    public int cardCount() {
        return this.cards.size();
    }

    private void populate() {
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                Card card = new Card(suit, rank);

                this.cards.add(card);
            }
        }
    }

    public Card deal() {
        int index = randomGenerator.nextInt(this.cards.size()-1);
        Card card = this.cards.get(index);
        return card;
    }


//    public void shuffle() {
//        ArrayList<Card> temp = new ArrayList<>();
//
//        while(!this.cards.isEmpty()) {
//            int index = (int)(Math.random() * this.cards.size());
//            temp.add(this.cards.get(index));
//            this.cards.remove(index);
//        }
//        this.cards = temp;
//    }

    public void shuffle(){
        Collections.shuffle(this.cards);
    }

}
