/**
 * Created by Hamlix on 02/10/2016.
 */
import static org.testng.Assert.*;

public class CuboidTest {

    Cuboid c;

    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {
        c = new Cuboid(2.0,3.0,4.0);
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {

    }

    @org.testng.annotations.Test
    public void testSurface() throws Exception {
        double surface = 2.0 * (2.0*3.0 + 2.0*4.0 + 3.0*4.0);
        assertEquals(c.surface(),surface);
    }

    @org.testng.annotations.Test
    public void testVolume() throws Exception {
        double volume = 2.0 * 3.0 * 4.0;
        assertEquals(c.volume(),volume);
    }

}
