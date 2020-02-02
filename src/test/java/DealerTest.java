import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;
    private Player player1;

    @Before
    public void before(){
       dealer = new Dealer();
       player1 = new Player("Emma");
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0, dealer.handSize());
    }

    @Test
    public void hasDeck(){
        assertEquals(52, dealer.deckSize());
    }

    @Test
    public void canDealCardToPlayer(){
        dealer.dealCardToPlayer(player1);
        assertEquals(1, player1.handSize());
        assertEquals(51, dealer.deckSize());
    }

    @Test
    public void canDealCardToSelf(){
        dealer.dealCardToSelf();
        assertEquals(1, dealer.handSize());
        assertEquals(51, dealer.deckSize());
    }

    @Test
    public void canAddPlayersToGame(){
        dealer.addPlayer(player1);
        assertEquals(1, dealer.playerCount());
    }

    @Test
    public void canDealARound(){
        dealer.addPlayer(player1);
        dealer.dealRound();
        assertEquals(2, player1.handSize());
        assertEquals(2, dealer.handSize());
        assertEquals(48, dealer.deckSize());
    }

    @Test
    public void canCheckWhoWins(){
        dealer.addPlayer(player1);
        dealer.dealRound();
        assertEquals("Emma", dealer.compareHands(player1));
    }

}
