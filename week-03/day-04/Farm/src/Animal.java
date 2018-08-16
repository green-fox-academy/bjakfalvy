public class Animal {
    int hunger;
    int thirst;

   public void creatingAnimal(int hunger, int thirst) {
        this.hunger = 50;
        this.thirst = 50;
    }

   public void eat() {
        this.hunger--;
    }

    public void drink() {
        this.thirst--;
    }

   public void play() {
        this.hunger++;
        this.thirst++;
    }
}
