/**
 * Created by Hamlix on 02/10/2016.
 */
import static org.testng.Assert.*;

public class SphereTest {

    Sphere s;

    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {
        s = new Sphere(10.0);
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {

    }

    @org.testng.annotations.Test
    public void testSurface() throws Exception {
        double surface = 400.0 * Math.PI;
        assertEquals(s.surface(),surface);
    }

    @org.testng.annotations.Test
    public void testVolume() throws Exception {
        double volume = (4.0/3.0) * Math.PI * 1000.0;
        assertEquals(s.volume(),volume);
    }

}
