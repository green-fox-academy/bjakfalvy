public class Main {
    public static void main(String[] args){
        DiceSet diceSet = new DiceSet();
        int sum = 0;
        diceSet.roll();
        do{
            sum = 0;
            if (diceSet.dices[0] != 6){
                diceSet.reroll(0);
            }
            if (diceSet.dices[1] != 6){
                diceSet.reroll(1);
            }
            if (diceSet.dices[2] != 6){
                diceSet.reroll(2);
            }
            if (diceSet.dices[3] != 6){
                diceSet.reroll(3);
            }
            if (diceSet.dices[4] != 6){
                diceSet.reroll(0);
            }
            if (diceSet.dices[5] != 6){
                diceSet.reroll(5);
            }
            for (int i = 0; i < diceSet.dices.length; i++){
                sum += diceSet.getCurrent(i);
            }

        }while (sum !=36);
        diceSet.getCurrent();
        diceSet.roll();
        diceSet.getCurrent();
        diceSet.getCurrent(5);
        diceSet.reroll();
        diceSet.getCurrent();
        diceSet.reroll(4);
        diceSet.getCurrent();

    }
}
