//package DEV2.3.TP03.Junit4Exemples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;

import org.junit.Test;
//import org.junit.internal.runners.statements.ExpectException;

public class TestLargest {
    @Test
    public void testSimple() {
        assertEquals(9, Largest.largest(new int[] {9,8,7}));        
    }

    @Test
    public void test2() {
        assertNotNull(Largest.largest(new int[] {10,1,5}));
    }

    @Test
    public void test3() {
        assertEquals(1, Largest.largest(new int[] {1}));
    }

    @Test(expected = NullPointerException.class)
    public void test4() {
        Largest.largest(null);
    }
}