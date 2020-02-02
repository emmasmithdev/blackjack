import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;
    private Card card;
    private Card card2;

    @Before
    public void before(){
        player1 = new Player("Emma");
        card = new Card(SuitType.HEARTS, RankType.QUEEN);
        card2 = new Card(SuitType.DIAMONDS, RankType.ACE);
    }

    @Test
    public void hasName(){
        assertEquals("Emma", player1.getName());
    }

    @Test
    public void startsWithEmptyHand(){
        assertEquals(0, player1.handSize());
    }

    @Test
    public void canAddCardToHand(){
        player1.addCard(card);
        assertEquals(1, player1.handSize());
    }

    @Test
    public void playerCanViewCards(){
        player1.addCard(card);
        player1.addCard(card2);
        String returnedCard1 = player1.viewCards().get(0);
        String returnedCard2 = player1.viewCards().get(1);
        assertEquals("QUEEN of HEARTS", returnedCard1);
        assertEquals("ACE of DIAMONDS", returnedCard2);
    }

    @Test
    public void canGetTotalCardScore(){
        player1.addCard(card);
        player1.addCard(card2);
        assertEquals(11, player1.handTotal());
    }
}
