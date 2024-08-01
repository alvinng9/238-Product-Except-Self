package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void productExceptSelfTest() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{24, 12, 8, 6}, solution.productExceptSelf(
                new int[]{1,2,3,4}));
        assertArrayEquals(new int[]{0,0,9,0,0}, solution.productExceptSelf(
                new int[]{-1,1,0,-3,3}));
    }
}