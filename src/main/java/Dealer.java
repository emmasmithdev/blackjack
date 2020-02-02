import java.util.ArrayList;

public class Dealer {

    private Deck deck;
    private ArrayList<Card> hand;
    private ArrayList<Player> players;

    public Dealer(){
        this.deck = new Deck();
        this.hand = new ArrayList<>();
        this.players = new ArrayList<>();
    }

    public int deckSize(){
        return this.deck.cardCount();
    }

    public int handSize(){
        return this.hand.size();
    }

    public void shuffleDeck(){
        this.deck.shuffle();
    }

    public void dealCardToPlayer(Player player){
        Card card = this.deck.deal();
        player.addCard(card);
    }

    public void dealCardToSelf(){
        Card card = this.deck.deal();
        this.hand.add(card);
    }

    public int playerCount(){
        return this.players.size();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void dealRound() {
        for (int i = 0; i < 2; i++) {
            for (Player player : this.players) {
                dealCardToPlayer(player);
                dealCardToSelf();
            }
        }
    }

}
