/**
 * Created by Hamlix on 02/10/2016.
 */
import static org.testng.Assert.*;

public class ConeTest {

    Cone c;

    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {
        c = new Cone(10.0,5.0);
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {

    }

    @org.testng.annotations.Test
    public void testSurface() throws Exception {
        double base = Math.PI * 25.0;
        double laterale = Math.PI * 5.0 * Math.sqrt(125.0);
        double total = base + laterale;
        assertEquals(c.surface(),total);
    }

    @org.testng.annotations.Test
    public void testVolume() throws Exception {
        double volume = (1.0/3.0) * Math.PI * 250.0;
        assertEquals(c.volume(),volume);
    }

}
