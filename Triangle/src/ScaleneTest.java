import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dat on 6/21/2016.
 *
 *JUnit test to test scalene triangle types
 */
public class ScaleneTest {

    @Test
    public void test(){

        Triangle scalene1 = new Triangle(22, 33, 1);
        Triangle scalene2 = new Triangle(1.0, 2.0, 1.1);
        Triangle scalene3 = new Triangle(100, 101, 100.1);
        Triangle scalene4 = new Triangle(0.1, 0.2, 0.3);
        Triangle scalene5 = new Triangle(1, 2, 3);

        assertEquals("Scalene", scalene1.triangleType());
        assertEquals("Scalene", scalene2.triangleType());
        assertEquals("Scalene", scalene3.triangleType());
        assertEquals("Scalene", scalene4.triangleType());
        assertEquals("Scalene", scalene5.triangleType());

    }


}