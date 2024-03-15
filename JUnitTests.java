import org.junit.Test;
import static org.junit.Assert.*;

public class checkItTest {

    @Test
    public void testCheckItPredicateCoverage1() {
        assertTrue(CheckIt.checkIt(true, false, false));
    }

    @Test
    public void testCheckItPredicateCoverage2() {
        assertFalse(CheckIt.checkIt(false, true, false));
    }

    @Test
    public void testCheckItCACC1() {
        assertTrue(CheckIt.checkIt(true, true, false));
        assertFalse(CheckIt.checkIt(false, true, false));
    }

    @Test
    public void testCheckItCACC2() {
        assertTrue(CheckIt.checkIt(true, true, false));
        assertFalse(CheckIt.checkIt(false, false, true));
    }

    @Test
    public void testCheckItCACC3() {
        assertTrue(CheckIt.checkIt(true, true, false));
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    @Test
    public void testCheckItCACC4() {
        assertTrue(CheckIt.checkIt(true, false, true));
        assertFalse(CheckIt.checkIt(false, true, false));
    }

    @Test
    public void testCheckItCACC5() {
        assertTrue(CheckIt.checkIt(true, false, true));
        assertFalse(CheckIt.checkIt(false, false, true));
    }

    @Test
    public void testCheckItCACC6() {
        assertTrue(CheckIt.checkIt(true, false, true));
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    @Test
    public void testCheckItCACC7() {
        assertTrue(CheckIt.checkIt(true, false, false));
        assertFalse(CheckIt.checkIt(false, true, false));
    }

    @Test
    public void testCheckItCACC8() {
        assertTrue(CheckIt.checkIt(true, false, false));
        assertFalse(CheckIt.checkIt(false, false, true));
    }

    @Test
    public void testCheckItCACC9() {
        assertTrue(CheckIt.checkIt(true, false, false));
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    @Test
    public void testCheckItCACC10() {
        assertTrue(CheckIt.checkIt(false, true, true));
        assertFalse(CheckIt.checkIt(false, false, true));
    }

    @Test
    public void testCheckItCACC11() {
        assertTrue(CheckIt.checkIt(false, true, true));
        assertFalse(CheckIt.checkIt(false, true, false));
    }
}