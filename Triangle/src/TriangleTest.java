import org.junit.runners.Suite;
import org.junit.runner.RunWith;
/**
 * Created by Dat on 6/23/2016.
 *
 * Test all triangle types
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({EquilateralTest.class, InvalidTriangleTest.class, IsoscelesTest.class, ScaleneTest.class})
public class TriangleTest {
}
