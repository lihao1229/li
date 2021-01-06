package code;


import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleTestTest {
    SimpleTest test = new SimpleTest();
    @Test
    public void add() {

        int z = test.add(2,3);
        assertEquals(5,z);
    }

    @Test
    public void divide() {
        int x = test.divide(3,3);
        assertEquals(1,x);
    }

    @Test
    public void num() {
        int[] shuzu = test.num(2,3);
        final int[] a = new int[2];
        a[0]=2;
        a[1]=3;
        assertArrayEquals(a, shuzu);
    }
}