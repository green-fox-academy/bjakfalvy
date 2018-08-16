public class Pirate {
    int intoxication;
    boolean passedOut;
    boolean dead;


    public void drinkSomeRum(){
        if (this.dead = true){
            System.out.println("he's dead");
        }
        intoxication++;
    }

    public void howsItGoingMate(){
        if (this.intoxication < 4) System.out.println("Pour me anudder!");
        else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.passedOut = true;
        }
    }

    public void die(){
        this.dead = true;

    }

    public void brawl(Pirate enemy){
        if (!enemy.dead){

        }
    }
}
