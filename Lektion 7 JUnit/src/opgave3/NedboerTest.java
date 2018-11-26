package opgave3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NedboerTest {
    Nedboer n = new Nedboer();

    @Test
    public void Test1() {
        assertEquals(30, n.besteTreFerieUger());
    }
    @Test
    public void Tets2() {
        assertEquals(25, n.bedsteFerieUgerStart(4));
    }
    @Test
    public void Test3() {
        assertEquals(42, n.mestEnsNedboer());
    }
}
