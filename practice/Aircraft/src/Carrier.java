import java.util.ArrayList;

public class Carrier {
    ArrayList<Aircraft> carrier;
    private int ammo;
    private int HP;

    Carrier(int ammo, int HP) {
        carrier = new ArrayList<>();
        this.ammo = ammo;
        this.HP = HP;
    }

    public void add(Aircraft aircraft) {
        carrier.add(aircraft);
    }

    public void fill(int amount) {
        this.ammo = ammo - amount * carrier.size();
        if (ammo < amount * carrier.size()) {
            for (int i = 0; i < carrier.size(); i++) {
                if (carrier.get(i).isPriority()) {
                    carrier.get(i).refill(amount);
                }
            }
        }
        for (int i = 0; i < carrier.size(); i++) {
            carrier.get(i).refill(amount);
        }
        if (ammo <= 0) {
            throw new ArithmeticException();
        }
    }

    public void fight(Carrier enemy) {
        int allDamage = 0;
        for (int i = 0; i < carrier.size(); i++) {
            allDamage += carrier.get(i).fight();
        }
        enemy.HP -= allDamage;
    }

    public void getStatus() {
        if (HP == 0) {
            System.out.println("It's dead, Jim :-(");
        } else {
            int totalDamage = 0;
            for (int i = 0; i < carrier.size(); i++) {
                totalDamage += carrier.get(i).getDamage();
            }
            System.out.println("HP: " + HP + ", " + "Aircraft count: " + carrier.size() + ", " + "Ammo storage: " + this.ammo + ", " + "Total damage: " + totalDamage + "\n" + "Aircrafts:");
            for (int i = 0; i < carrier.size(); i++) {
                carrier.get(i).getStatus();
            }
        }
    }
}
