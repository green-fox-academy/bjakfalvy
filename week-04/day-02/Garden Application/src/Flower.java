public class Flower extends Plants {
    Flower(String color, double level){
        this.color = color;
        this.level = level;
        this.water = 5;
        this.absorption = 0.75;
        this.type = "flower";
    }
}
