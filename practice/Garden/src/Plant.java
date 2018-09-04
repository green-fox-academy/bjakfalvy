public class Plant {
    private String type;
    private String color;
    private double waterAmount;

    Plant (String type, String color){
        this.type = type;
        this.color = color;
        this.waterAmount = 0;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }


    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double watering, double absorption) {
        this.waterAmount = waterAmount + watering * absorption;
    }

    public boolean isWateringNeeded(){
        if (getWaterAmount() < 10){
            return true;
        }
        return false;
    }

    public void getInfo(){
        if (isWateringNeeded()){
            System.out.println("The " + getColor() + " " + getType() + " needs water!");
        }
        System.out.println("The " + getColor() + " " + getType() + " doesn't need water.");
    }
}
