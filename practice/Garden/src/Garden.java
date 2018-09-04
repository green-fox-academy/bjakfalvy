import java.util.ArrayList;

public class Garden {
    private String name;
    private ArrayList<Plant> garden;

    Garden(String name) {
        this.name = name;
        this.garden = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        garden.add(flower);
    }

    public void addTree(Tree tree) {
        garden.add(tree);
    }

    public void getInfo() {
        for (int i = 0; i < garden.size(); i++) {
            garden.get(i).getInfo();
        }
    }

    public void waterPlant(int waterAmount) {
        System.out.println();
        System.out.println("Watering with: " + waterAmount);
        int counter = 0;
        int exactWaterAmount = 0;
        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).isWateringNeeded()) {
                counter++;
            }
        }
        exactWaterAmount = waterAmount / counter;
        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).isWateringNeeded()) {
                if (garden.get(i) instanceof Flower) {
                    ((Flower) garden.get(i)).waterFlower(exactWaterAmount);
                } else {
                    ((Tree) garden.get(i)).waterTree(exactWaterAmount);
                }
            }
        }
    }
}

