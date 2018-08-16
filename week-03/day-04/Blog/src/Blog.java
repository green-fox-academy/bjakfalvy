import java.util.ArrayList;
import java.util.List;

public class Blog{
    List<BlogPost> list = new ArrayList<>();

    public void add(BlogPost post) {
        this.list.add(post);
    }

    public void delete(int i){
        this.list.remove(i);
    }

    public void update(int i, BlogPost post){
        list.add(i,post);
    }

}
