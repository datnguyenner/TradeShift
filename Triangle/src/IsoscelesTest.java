import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dat on 6/21/2016.
 *
 *JUnit test to test isosceles triangle types
 */
public class IsoscelesTest {

    @Test
    public void test(){

        Triangle isosceles1 = new Triangle(4.0, 4.0, 3);
        Triangle isosceles2 = new Triangle(4.0, 1, 4.0);
        Triangle isosceles3 = new Triangle(100, 100, 2);
        Triangle isosceles4 = new Triangle(22.5, 1, 22.5);
        Triangle isosceles5 = new Triangle(4.0, 1.11, 1.11);

        assertEquals("Isosceles", isosceles1.triangleType());
        assertEquals("Isosceles", isosceles2.triangleType());
        assertEquals("Isosceles", isosceles3.triangleType());
        assertEquals("Isosceles", isosceles4.triangleType());
        assertEquals("Isosceles", isosceles5.triangleType());

    }


}