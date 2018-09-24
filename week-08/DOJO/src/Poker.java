import java.util.ArrayList;

public class Poker {

    public static void main(String[] args) {

    }

    public String whiteWins(ArrayList<Card> list1, ArrayList<Card> list2) {
        for (Card card : list2) {
            if (card.getValue() == 14) {
                return "White wins!";
            }
        }
        return "";
    }

    public String isFlush(ArrayList<Card> list1) {
        String letsGetFlush = list1.get(0).getSuit();
        for (Card card : list1) {
            if (!card.getSuit().equals(letsGetFlush)) {
                return "";
            }
        }
        return "White wins!";
    }
}
