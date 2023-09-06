package org.edu_leetcode.easy.Roman_to_Integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerSolutionTest {
    private final RomanToIntSolution romanToIntSolution = new RomanToIntSolution();

    @Test
    void romanToIntTestCase1() {
        String roman3 = "III";
        int expectedResult = 3;

        assertEquals(expectedResult, romanToIntSolution.romanToInt(roman3));
    }

    @Test
    void romanToIntTestCase2() {
        String roman3 = "LVIII";
        int expectedResult = 58;

        assertEquals(expectedResult, romanToIntSolution.romanToInt(roman3));
    }

    @Test
    void romanToIntTestCase3() {
        String roman3 = "MCMXCIV";
        int expectedResult = 1994;

        assertEquals(expectedResult, romanToIntSolution.romanToInt(roman3));
    }

    @Test
    void romanToIntTestCase4() {
        String roman3 = "IX";
        int expectedResult = 9;

        assertEquals(expectedResult, romanToIntSolution.romanToInt(roman3));
    }
}