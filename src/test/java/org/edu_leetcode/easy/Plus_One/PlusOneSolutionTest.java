package org.edu_leetcode.easy.Plus_One;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneSolutionTest {
    private final PlusOneSolution plusOneSolution = new PlusOneSolution();

    @Test
    void plusOneTestCase1(){
        int[] digits = {1,2,3};
        int[] expected = {1,2,4};
        assertArrayEquals(expected, plusOneSolution.plusOne(digits));
    }

    @Test
    void plusOneTestCase2(){
        int[] digits = {4,3,2,1};
        int[] expected = {4,3,2,2};
        assertArrayEquals(expected, plusOneSolution.plusOne(digits));
    }

    @Test
    void plusOneTestCase3(){
        int[] digits = {9};
        int[] expected = {1, 0};
        assertArrayEquals(expected, plusOneSolution.plusOne(digits));
    }

    @Test
    void plusOneTestCase4(){
        int[] digits = {9, 9};
        int[] expected = {1, 0, 0};
        assertArrayEquals(expected, plusOneSolution.plusOne(digits));
    }


}