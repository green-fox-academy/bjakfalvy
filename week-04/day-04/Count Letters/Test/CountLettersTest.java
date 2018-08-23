import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void counter() {
        CountLetters x = new CountLetters();
        x.characterCount("almafaaa");
        assertEquals(x, 5);

    }
}