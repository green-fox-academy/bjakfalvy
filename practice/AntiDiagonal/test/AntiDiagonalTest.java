import org.junit.Test;

import static org.junit.Assert.*;

public class AntiDiagonalTest {


    @Test
    public void getAntiDiagonalAvg() {
        int[][]testMatrix = new int[][]{{1,7,3},{5,2,7},{9,9,9}};
        double result = AntiDiagonal.getAntiDiagonalAvg(testMatrix);
        assertEquals(4.6,result,0.1);
    }
}