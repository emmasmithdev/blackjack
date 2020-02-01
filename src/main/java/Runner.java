public class Runner {

    public static void main(String[] args) {
        UI ui = new UI();
        Deck deck = new Deck();
        ui.welcome();
        String name = ui.playerName();
        ui.printPlayersCard(name);
        deck.deal();
        deck.shuffle();
    }
}
