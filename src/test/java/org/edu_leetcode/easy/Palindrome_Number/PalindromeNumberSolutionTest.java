package org.edu_leetcode.easy.Palindrome_Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberSolutionTest {
    private final PalindromeNumberSolution solution = new PalindromeNumberSolution();

    @Test
    void isPalindromeTestCase1() {
        int num = 121;
        assertTrue(solution.isPalindrome(121));
    }

    @Test
    void isPalindromeTestCase2() {
        int num = -121;
        assertFalse(solution.isPalindrome(num));
    }

    @Test
    void isPalindromeTestCase3() {
        int num = 10;
        assertFalse(solution.isPalindrome(num));
    }
}