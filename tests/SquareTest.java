/**
 * Created by Hamlix on 02/10/2016.
 */

import static org.testng.Assert.*;

public class SquareTest {

    Square s;

    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {
        s = new Square(2.0,2.0);
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {

    }

    @org.testng.annotations.Test
    public void sameLength() throws Exception{
        Square other = new Square(2.0,3.0);
        assertEquals(other.getWidth(),2.0);
    }

}
