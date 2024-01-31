package org.edu_leetcode.easy.Sqrt_x;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtXSolutionTest {
    private final SqrtXSolution solution = new SqrtXSolution();

    @Test
    void SqrtXSolutionCase1(){
        int x = 4;
        int expected = 2;
        assertEquals(expected, solution.mySqrt(x));
    }

    @Test
    void SqrtXSolutionCase2(){
        int x = 8;
        int expected = 2;
        assertEquals(expected, solution.mySqrt(x));
    }

}