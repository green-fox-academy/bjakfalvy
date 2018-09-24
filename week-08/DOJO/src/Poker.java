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

    public boolean differingValues(ArrayList<Card> list1) {
        for (int i = 0; i < list1.size() - 1; i++) {
            for (int j = i + 1; j < list1.size(); j++) {
                if (list1.get(i).getValue() == list1.get(j).getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public String isHighCard(ArrayList<Card> list) {
        if (differingValues(list) && isFlush(list) == "") {
            return "Black wins!";
        }
        return "";
    }

    public String isTie(ArrayList<Card> list1, ArrayList<Card> list2) {
        if (list1 == list2) {
            return "";
        }
        return "Tie";

    }
}
