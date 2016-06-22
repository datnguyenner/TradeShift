import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dat on 6/21/2016.
 *
 *JUnit test to test all triangle types
 */
public class TriangleTest {

    @Test
    public void test(){

        Triangle scalene = new Triangle(22, 33, 1);
        Triangle equilateral = new Triangle(5.0, 5, 5.0);
        Triangle isosceles = new Triangle(4.0, 4.0, 3);
        Triangle isosceles2 = new Triangle(4.0, 1, 4.0);
        Triangle notATriangle = new Triangle(1, 0, 1);
        Triangle notATriangle2 = new Triangle(-1, -1, 1);


        assertEquals("Scalene", scalene.triangleType());
        assertEquals("Equilateral", equilateral.triangleType());
        assertEquals("Isosceles", isosceles.triangleType());
        assertEquals("Isosceles", isosceles2.triangleType());
        assertEquals("Invalid", notATriangle.triangleType());
        assertEquals("Invalid", notATriangle2.triangleType());


    }


}