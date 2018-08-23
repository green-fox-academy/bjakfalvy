import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {
    private Sum x = new Sum();


    @Test
    public void sum() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,6,9,3));
        assertEquals(x.sum(list), 23);
    }

    @Test
    public void emptyTest(){
        ArrayList<Integer> list = new ArrayList<>();
        assertEquals(x.sum(list), 23);
    }

    @Test
    public void oneElementTest(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8));
        assertEquals(x.sum(list), 23);
    }

    @Test
    public void multipleElementTest(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,4,6,7,5,3,2));
        assertEquals(x.sum(list), 23);
    }

    @Test
    public void nullTest(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(null));
        assertEquals(x.sum(list), 23);
    }
}