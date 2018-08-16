import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> list = new ArrayList<>();
    int slots;

    public void breed() {
        if (slots != 0) {
            Animal newAnimal = new Animal();
        }
    }

    public void slaughter(){
        int max = 0;
        for (Animal animal : list){
            if (animal.hunger == max) list.remove(animal);
        }
    }
}
