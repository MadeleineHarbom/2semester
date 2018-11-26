package opgave1;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class BilforsikringTest {
    Bilforsikring b1 = new Bilforsikring();
    Bilforsikring b2;

    @Before
    public void setUp() throws Exception {
        b1.setGrundpræmie(100.0);
        assertNotNull(b1);

    }

    @Test(expected = RuntimeException.class) // DENNE TESTER AT EXCEPTION BLIVER THROWN
    public void TestPrimies1() {

            double result1 = b1.beregnPræmie(20, false, 7);
            double expected1 = b1.getGrundPræmie();

            //assertEquals( expected1,result1, 0.1);



    }

    @Test // FIX ME
    public void TestPrimies2() {
        try {
            double result2 = b1.beregnPræmie(24, true,8);
            double expected2 = b1.getGrundPræmie()*1.25*0.95;
            assertEquals(expected2, result2, 0.1);
        }
        catch (RuntimeException e) {
            e.getMessage();
        }


    }

    @Test //BEHOEVER IKKE HAANDTERE EXCEPTIONS I TEST
    public void TestPrimies3() {
        double result3 = b1.beregnPræmie(35, true,5);
        double expected3 = b1.getGrundPræmie()*0.95*0.85;

        assertEquals(expected3, result3, 0.1);

    }

}
