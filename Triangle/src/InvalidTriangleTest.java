import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dat on 6/21/2016.
 *
 *JUnit test to test invalid triangle types
 */
public class InvalidTriangleTest {

    @Test
    public void test(){

        Triangle notATriangle1 = new Triangle(1, 0, 1);
        Triangle notATriangle2 = new Triangle(0, 0, 0);
        Triangle notATriangle3 = new Triangle(-1, -1, 1);
        Triangle notATriangle4 = new Triangle(-100, 100, 9);
        Triangle notATriangle5 = new Triangle(-6, -6, -6);

        assertEquals("Invalid", notATriangle1.triangleType());
        assertEquals("Invalid", notATriangle2.triangleType());
        assertEquals("Invalid", notATriangle3.triangleType());
        assertEquals("Invalid", notATriangle4.triangleType());
        assertEquals("Invalid", notATriangle5.triangleType());

    }


}