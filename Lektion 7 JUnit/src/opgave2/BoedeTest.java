package opgave2;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class BoedeTest {
    Boede b = new Boede();

    @Test
    public void testBoede1b() {
        int b1 = b.findeBoede(LocalDate.of(2010,01,22),
                LocalDate.of(2010,01,26), 16);
        assertEquals(10,b1);
    }
    @Test
    public void testBoede2b() {
        int b1 = b.findeBoede(LocalDate.of(2010,01,22),
                LocalDate.of(2010,01,30), 16);
        assertEquals(30, b1);
    }

    @Test
    public void testBoede3b() {
        int b1 = b.findeBoede(LocalDate.of(2010,01,22),
                LocalDate.of(2010,03,30), 16);
        assertEquals(45, b1);
    }


    @Test
    public void testBoede1v() {
        int b1 = b.findeBoede(LocalDate.of(2010,01,22),
                LocalDate.of(2010,01,26), 26);
        assertEquals(20,b1);
    }
    @Test
    public void testBoede2v() {
        int b1 = b.findeBoede(LocalDate.of(2010,01,22),
                LocalDate.of(2010,01,30), 26);
        assertEquals(60, b1);
    }

    @Test
    public void testBoede3v() {
        int b1 = b.findeBoede(LocalDate.of(2010,01,22),
                LocalDate.of(2010,03,30), 26);
        assertEquals(90, b1);
    }

}
