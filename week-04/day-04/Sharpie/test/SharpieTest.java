import org.junit.Test;
import static org.junit.Assert.*;

public class SharpieTest {
    Sharpie x;

    @Test
    public void color() {
        x = new Sharpie("green", 5);
        x.use();
        assertEquals(x.color == "green");
    }

    @Test
    public void use() {
        x = new Sharpie("black", 1);
        x.use();
        assertEquals(x.100,100);
    }
}