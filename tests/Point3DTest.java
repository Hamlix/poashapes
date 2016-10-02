/**
 * Created by Hamlix on 02/10/2016.
 */

import static org.testng.Assert.assertEquals;

public class Point3DTest{
    Point3D p;

    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {
        p = new Point3D(0.0,0.0,0.0);
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {

    }

    @org.testng.annotations.Test
    public void testIsOrigin() throws Exception {
        assertEquals(p.isOrigin(), true);
    }

    @org.testng.annotations.Test
    public void testTranslate() throws Exception {
        p.translate(1.0,2.0,3.0);
        assertEquals(p.getX(),1.0);
        assertEquals(p.getY(),2.0);
        assertEquals(p.getZ(),3.0);
    }

    @org.testng.annotations.Test
    public void testDistance() throws Exception {
        Point3D other = new Point3D(5.0,5.0,5.0);
        assertEquals(p.distance(other),Math.sqrt(75.0));
    }
}
