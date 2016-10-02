import static org.testng.Assert.*;

/**
 * Created by Hamlix on 26/09/2016.
 */
public class Point2DTest {
    Point2D p;
    Point2D q;

    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {
        p=new Point2D(0,0);
        q = new Point2D(2,2);
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {

    }

    @org.testng.annotations.Test
    public void testTranslate() throws Exception {
        p.translate(2,3);
        assertEquals(p.getX(),2.0);
        assertEquals(p.getY(),3.0);
    }

    @org.testng.annotations.Test
    public void testIsOrigin() throws Exception {
        Point2D r = new Point2D(0,3);
        Point2D s = new Point2D(2,0);
        assertTrue(p.isOrigin());
        assertFalse(q.isOrigin());
        assertFalse(r.isOrigin());
        assertFalse(s.isOrigin());

    }

    @org.testng.annotations.Test
    public void testDistance() throws Exception {
        assertEquals(p.distance(q),Math.sqrt(8.0));
    }

}