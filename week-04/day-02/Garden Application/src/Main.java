public class Main {
    public static void main(String args[]){
        Garden garden = new Garden();
        garden.addPlant(new Flower("yellow", 4));
        garden.addPlant(new Flower("blue", 3));
        garden.addPlant(new Tree("purple", 4));
        garden.addPlant(new Tree("orange", 4));
        garden.info();
        garden.waterPlants(40);
        garden.info();
        garden.waterPlants(70);
        garden.info();
    }
}
