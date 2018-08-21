import java.util.ArrayList;
import java.util.List;

public class Garden {
        List<Plants> garden;

        Garden(){
            garden = new ArrayList<>();
        }

        void addPlant(Plants plant){
            this.garden.add(plant);
        }

        void info(){
            for (Plants plant : garden){
                if (plant.level < plant.water){
                    System.out.println("The " + plant.color + " " + plant.type
                    + " needs water.");
                } else {
                    System.out.printf("The " + plant.color + " " + plant.type
                    + "doesn't need water.");
                }
            }
            System.out.println();
        }

        void waterPlants(int x){
            System.out.println("Watering with " + x);
            int thirst = 0;
            for (Plants plant : this.garden){
                if (plant.level < plant.water){
                    thirst ++;
                }
            }
            x/=thirst;
            for (Plants plant : this.garden) {
                if (plant.level < plant.water){
                    plant.water(x);
                }
            }
        }

}
