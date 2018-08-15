public class Sharpie {
    String color;
    float width;
    float inkAmount = 100;

    void creatSharpie(String color, float width ){
        this.color = color;
        this.width = width;
        this.inkAmount = 100;

    }

    void use(){
        this.inkAmount= inkAmount - 1;
    }




}
