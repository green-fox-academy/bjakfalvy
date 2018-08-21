public class Plants {
    String type;
    String color;
    int water;
    double level;
    double absorption;

    void water(int x){
        this.level += x * absorption;
    }
}
