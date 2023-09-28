package org.edu_leetcode.easy.Longest_Common_Prefix;

import org.edu_leetcode.easy.Merge_Two_Sorted_Lists.Longest_Common_Prefix.LongestCommonPrefixSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixSolutionTest {

    private final LongestCommonPrefixSolution solution = new LongestCommonPrefixSolution();

    @Test
    void longestCommonPrefixTestCase1() {
        String[] strs = {"flower","flow","flight"};
        String expectedResult = "fl";

        assertEquals(expectedResult, solution.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixTestCase2() {
        String[] strs = {"dog","racecar","car"};
        String expectedResult = "";

        assertEquals(expectedResult, solution.longestCommonPrefix(strs));
    }
}
