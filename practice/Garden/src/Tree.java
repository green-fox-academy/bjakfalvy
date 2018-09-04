public class Tree extends Plant {

    Tree(String type, String color) {
        super(type, color);
    }

    public boolean isWateringNeeded(){
        if (getWaterAmount()< 10){
            return true;
        }
        return false;
    }

    public void waterTree(double waterAmount){
        setWaterAmount(waterAmount,0.4);
    }
}
