import java.util.Scanner;

public class UI {

        public void welcome() {

            System.out.println("Let's play Blackjack!");
        }

        public String playerName() {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n Player 1, please enter your name: ");
            String name = sc.nextLine();
            return name;
        }

        public void printShuffleMessage(){
            System.out.println("The dealer is shuffling the cards...");
        }

        public void printDealMessage(){
            System.out.println("The dealer is dealing the cards...");
        }

        public void printPlayerCards(Player player) {
            String name = player.getName();
            String card1 = player.viewCards().get(0);
            String card2 = player.viewCards().get(1);
            System.out.println(name + " has the " + card1 + " and the " + card2);
        }

        public void printPlayerScore(Player player){
            String name = player.getName();
            int total = player.handTotal();
            System.out.println(name + "'s total is: " + total);
        }

        public void twistStickBustMessage(Player player) {
            String name = player.getName();
            int total = player.handTotal();
            String reply = "T";
                if (total > 21) {
                    System.out.println(name + "you are bust.");
                } else {
                    do {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter T to twist or S to stick: ");
                    reply = sc.nextLine().toUpperCase();
                    }
                    while ("T".equals(reply));
            }
        }
    }
