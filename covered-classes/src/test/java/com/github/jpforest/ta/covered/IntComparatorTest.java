package com.github.jpforest.ta.covered;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class IntComparatorTest {

    @Test
    public void testInstance() {
        IntComparator a = new IntComparator(7);

        assertTrue(a.isBiggerThan(5));
        assertFalse(a.isBiggerThan(9));

        assertTrue(a.isLessThan(9));
        assertFalse(a.isLessThan(5));

        assertTrue(a.isEqualsTo(7));
        assertFalse(a.isEqualsTo(6));
    }

    @Test
    public void testAGreaterThenB() {
        assertEquals(7, IntComparator.max(7, 5));
    }

    @Test
    public void testBGreaterThenA() {
        assertEquals(9, IntComparator.max(3, 9));
    }

    @Test
    public void testAEqualsB() {
        assertEquals(4, IntComparator.max(4, 4));
    }
}
