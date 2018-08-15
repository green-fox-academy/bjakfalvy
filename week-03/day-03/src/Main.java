
public class Main {
    public static void main(String[] args){
        PostIt orange = new PostIt(); //első object
        orange.backgroundColor = "orange";
        orange.textColor = "blue";
        orange.text = "Idea 1";

        PostIt pink = new PostIt(); //második object
        pink.backgroundColor = "pink";
        pink.textColor = "black";
        pink.text = "Awesome";

        PostIt yellow = new PostIt(); //harmadik object
        yellow.backgroundColor = "yellow";
        yellow.textColor = "green";
        yellow.text = "Superb!";

        orange.printInfo();
        System.out.println("-----------");
        pink.printInfo();
        System.out.println("-----------");
        yellow.printInfo();
    }
}
