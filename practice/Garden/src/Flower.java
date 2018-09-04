public class Flower extends Plant {
    Flower(String type, String color) {
        super(type, color);
    }

    @Override
    public boolean isWateringNeeded() {
        if(getWaterAmount() < 5){
            return true;
        }
        return false;
    }

    public void waterFlower(double waterAmount){
        setWaterAmount(waterAmount, 0.75);
    }
}
