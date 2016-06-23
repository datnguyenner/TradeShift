import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dat on 6/23/2016.
 *
 *JUnit test to test Equilateral triangle types
 */
public class EquilateralTest {

    @Test
    public void test(){

        Triangle equilateral1 = new Triangle(5, 5, 5.0);
        Triangle equilateral2 = new Triangle(100, 100, 100);
        Triangle equilateral3 = new Triangle(22, 22, 22);
        Triangle equilateral4 = new Triangle(1, 1, 1);
        Triangle equilateral5 = new Triangle(22.5, 22.5, 22.5);

        assertEquals("Equilateral", equilateral1.triangleType());
        assertEquals("Equilateral", equilateral2.triangleType());
        assertEquals("Equilateral", equilateral3.triangleType());
        assertEquals("Equilateral", equilateral4.triangleType());
        assertEquals("Equilateral", equilateral5.triangleType());

    }


}