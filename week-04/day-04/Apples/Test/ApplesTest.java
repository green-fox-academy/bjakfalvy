import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

    @Test
    public void getApple() {
        Apples myObject = new Apples();
        assertEquals("apple", myObject.getApple());
    }
}