public class Sharpie {
    String color;
    double width;
    double inkAmount = 100;

    void creatSharpie(String color, double width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;

    }

    void use() {
        this.inkAmount = inkAmount - 1;
    }

}