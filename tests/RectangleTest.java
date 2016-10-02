/**
 * Created by Hamlix on 02/10/2016.
 */

import static org.testng.Assert.*;

public class RectangleTest {

    Rectangle r;

    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {
        r = new Rectangle(2.0,3.0);
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {

    }

    @org.testng.annotations.Test
    public void testSurface() throws Exception {
        assertEquals(r.surface(),6.0);
    }

    @org.testng.annotations.Test
    public void testPerimeter() throws Exception {
        assertEquals(r.perimeter(),12.0);
    }

}
