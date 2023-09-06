package org.edu_leetcode.easy.Two_Sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumPalindromeNumberRomanToIntTwoSumSolutionTest {

    private final TwoSumSolution twoSumSolution = new TwoSumSolution();

    @Test
    void twoSumTestCase1() {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;

        int[] expected = new int[] {0, 1};

        Assertions.assertArrayEquals(expected, twoSumSolution.twoSum(nums, target));
    }
    @Test
    void twoSumTestCase2() {
        int[] nums = new int[] {3,2,4};
        int target = 6;

        int[] expected = new int[] {1, 2};

        Assertions.assertArrayEquals(expected, twoSumSolution.twoSum(nums, target));
    }
    @Test
    void twoSumTestCase3() {
        int[] nums = new int[] {3,3};
        int target = 6;

        int[] expected = new int[] {0, 1};

        Assertions.assertArrayEquals(expected, twoSumSolution.twoSum(nums, target));
    }
}