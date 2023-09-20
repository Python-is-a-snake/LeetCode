package org.edu_leetcode.easy.Remove_Duplicates_From_Sorted_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArraySolutionTest {
    private final RemoveDuplicatesFromSortedArraySolution solution = new RemoveDuplicatesFromSortedArraySolution();

    @Test
    void removeDuplicatesTestCase1() {
        int[] input = {1,1,2};
        int[] expected = {1,2};

        assertEquals(expected.length, solution.removeDuplicates(input));
    }

    @Test
    void removeDuplicatesTestCase2() {
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        int[] expected = {0,1,2,3,4};

        assertEquals(expected.length, solution.removeDuplicates(input));
    }
}