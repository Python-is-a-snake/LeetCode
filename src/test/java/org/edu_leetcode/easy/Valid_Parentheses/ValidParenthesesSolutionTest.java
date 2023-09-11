package org.edu_leetcode.easy.Valid_Parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesSolutionTest {

    private final ValidParenthesesSolution solution = new ValidParenthesesSolution();

    @Test
    void isValidTestCase1() {
        String s = "()";

        assertTrue(solution.isValid(s));
    }

    @Test
    void isValidTestCase2() {
        String s = "()[]{}";

        assertTrue(solution.isValid(s));
    }

    @Test
    void isValidTestCase3() {
        String s = "(]";

        assertFalse(solution.isValid(s));
    }

    @Test
    void isValidTestCase4() {
        String s = "({})";

        assertTrue(solution.isValid(s));
    }

    @Test
    void isValidTestCase5() {
        String s = "({[()]})";

        assertTrue(solution.isValid(s));
    }

    @Test
    void isValidTestCase6() {
        String s = "()({})";

        assertTrue(solution.isValid(s));
    }

    @Test
    void isValidTestCase7() {
        String s = "(){}}{";

        assertFalse(solution.isValid(s));
    }
}