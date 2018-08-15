public class Animal {
        int hunger;
        int thirst;

        void creatingAnimal(int hunger, int thirst){
            this.hunger = 50;
            this.thirst = 50;
        }

        void eat(){
            this.hunger --;
        }
        void drink(){
            this.thirst --;
        }
        void play(){
            this.hunger ++;
            this.thirst ++;
        }
}
