import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PokerTest {

    private Poker pokerGame = new Poker();

    @Test
    public void pokerCards() {
        ArrayList<Card> black = new ArrayList<Card>(5);
        Card card1 = new Card("H", 2);
        Card card2 = new Card("D", 3);
        Card card3 = new Card("S", 5);
        Card card4 = new Card("C", 9);
        Card card5 = new Card("D", 5);

        black.add(card1);
        black.add(card2);
        black.add(card3);
        black.add(card4);
        black.add(card5);

        ArrayList<Card> white = new ArrayList<>(5);
        Card card6 = new Card("C", 2);
        Card card7 = new Card("H", 3);
        Card card8 = new Card("S", 4);
        Card card9 = new Card("C", 8);
        Card card10 = new Card("H", 14);
        white.add(card6);
        white.add(card7);
        white.add(card8);
        white.add(card9);
        white.add(card10);

        assertEquals("White wins!", pokerGame.whiteWins(black, white));
    }

    @Test
    public void flushTest() {
        ArrayList<Card> black = new ArrayList<Card>(5);
        Card card1 = new Card("H", 2);
        Card card2 = new Card("S", 3);
        Card card3 = new Card("C", 5);
        Card card4 = new Card("D", 9);
        Card card5 = new Card("H", 5);
        black.add(card1);
        black.add(card2);
        black.add(card3);
        black.add(card4);
        black.add(card5);

        ArrayList<Card> white = new ArrayList<>(5);
        Card card6 = new Card("S", 2);
        Card card7 = new Card("S", 8);
        Card card8 = new Card("S", 14);
        Card card9 = new Card("S", 8);
        Card card10 = new Card("S", 13);
        white.add(card6);
        white.add(card7);
        white.add(card8);
        white.add(card9);
        white.add(card10);

        assertEquals("White wins!", pokerGame.isFlush(white));
    }

    @Test
    public void blackHighCard() {
        ArrayList<Card> black = new ArrayList<Card>(5);
        Card card1 = new Card("H", 2);
        Card card2 = new Card("S", 3);
        Card card3 = new Card("C", 5);
        Card card4 = new Card("D", 9);
        Card card5 = new Card("H", 13);
        black.add(card1);
        black.add(card2);
        black.add(card3);
        black.add(card4);
        black.add(card5);

        ArrayList<Card> white = new ArrayList<>(5);
        Card card6 = new Card("S", 2);
        Card card7 = new Card("D", 8);
        Card card8 = new Card("S", 14);
        Card card9 = new Card("H", 8);
        Card card10 = new Card("S", 13);
        white.add(card6);
        white.add(card7);
        white.add(card8);
        white.add(card9);
        white.add(card10);

        assertEquals("Black wins!", pokerGame.isHighCard(black));
    }

    @Test
    public void isTie() {
        ArrayList<Card> black = new ArrayList<Card>(5);
        Card card1 = new Card("H", 2);
        Card card2 = new Card("D", 3);
        Card card3 = new Card("S", 5);
        Card card4 = new Card("C", 9);
        Card card5 = new Card("D", 13);
        black.add(card1);
        black.add(card2);
        black.add(card3);
        black.add(card4);
        black.add(card5);

        ArrayList<Card> white = new ArrayList<>(5);
        Card card6 = new Card("S", 2);
        Card card7 = new Card("D", 3);
        Card card8 = new Card("S", 5);
        Card card9 = new Card("H", 9);
        Card card10 = new Card("S", 13);
        white.add(card6);
        white.add(card7);
        white.add(card8);
        white.add(card9);
        white.add(card10);

        assertEquals("Tie", pokerGame.isTie(black, white));
    }


}
