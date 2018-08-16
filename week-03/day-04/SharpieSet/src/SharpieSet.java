import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> set = new ArrayList<>();

    public int countUsable(){
        int useable = 0;
        for (Sharpie sharpie : set){
            if (sharpie.inkAmount > 0) useable++;
        }
        return useable;
    }

    public void removeTrash(){
        for (Sharpie sharpie : set){
            if (sharpie.inkAmount == 0) set.remove(sharpie);
        }
    }
}
