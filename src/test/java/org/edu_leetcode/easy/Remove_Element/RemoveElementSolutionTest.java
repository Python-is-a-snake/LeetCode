package org.edu_leetcode.easy.Remove_Element;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveElementSolutionTest {
    private final RemoveElementSolution solution = new RemoveElementSolution();

    @Test
    void removeElementTestCase1() {
        int[] nums = {3,2,2,3};
        int expected = 2;
        int val = 3;

        assertEquals(expected, solution.removeElement(nums, val));
    }
}