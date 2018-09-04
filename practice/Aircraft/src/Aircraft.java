public class Aircraft {
    private String type;
    private int ammo;
    private int maxAmmo;
    private int damage;
    private int baseDamage;

    Aircraft(String type, int baseDamage, int maxAmmo){
        ammo = 0;
        this.type = type;
        this.baseDamage = baseDamage;
        this.maxAmmo = maxAmmo;
    }


    public String getType() {
        return type;
    }

    public int getAmmo() {
        return ammo;
    }

    public int getDamage() {
        return damage;
    }

    public String getStatus(){
        return "Type " + this.type + ", " + "Ammo: " + this.ammo + ", " + "Base Damage: " + this.damage;
    }

    public int fight(){
        this.damage = this.baseDamage * this.ammo;
        this.ammo = 0;
        return damage;
    }

    public int refill(int refillAmount) {
        this.ammo = ammo + refillAmount;
        if (refillAmount > this.maxAmmo) {
            this.ammo = maxAmmo;
        }
        return refillAmount - maxAmmo;
    }

    public boolean isPriority(){
        if (this.type.equals("F35")){
            return true;
        }
        return false;
    }
}
