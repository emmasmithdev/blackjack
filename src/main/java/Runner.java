public class Runner {

    public static void main(String[] args) {

        UI ui = new UI();
        Dealer dealer = new Dealer();

        ui.welcome();
        String name = ui.playerName();
        Player player1 = new Player(name);
        dealer.addPlayer(player1);
        ui.printShuffleMessage();
        dealer.shuffleDeck();
        ui.printDealMessage();
        dealer.dealRound();
        ui.printPlayerCards(player1);
        ui.printPlayerScore(player1);
//        ui.twistStickBustMessage(player1);
        ui.printDealerCards(dealer);
        ui.printDealerScore(dealer);
        String winner = dealer.compareHands(player1);
        ui.printWinnerMessage(winner);
    }
}
