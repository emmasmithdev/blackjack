import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int handSize(){
        return this.hand.size();
    }

    public void addCard(Card card){
        this.hand.add(card);
    }

    public ArrayList<String> viewCards(){
        ArrayList<String> cardList = new ArrayList<>();
        for (Card card : this.hand){
            String rank = card.getRank().name();
            String suit = card.getSuit().name();
            String cardName = (rank + " of " + suit);
            cardList.add(cardName);
        }
        return cardList;
    }
}
