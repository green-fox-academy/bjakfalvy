public class Main {
    public static void main(String[] args) {
        Flower flowerOne = new Flower("Flower", "yellow");
        Flower flowerTwo = new Flower("Flower", "blue");

        Tree treeOne = new Tree("Tree", "pruple");
        Tree treeTwo = new Tree("Tree", "orange");

        Garden gardenList = new Garden("myFirstGarden");
        gardenList.addFlower(flowerOne);
        gardenList.addFlower(flowerTwo);
        gardenList.addTree(treeOne);
        gardenList.addTree(treeTwo);

        gardenList.getInfo();
        gardenList.waterPlant(40);
        gardenList.getInfo();
        gardenList.waterPlant(70);
        gardenList.getInfo();
    }
}
