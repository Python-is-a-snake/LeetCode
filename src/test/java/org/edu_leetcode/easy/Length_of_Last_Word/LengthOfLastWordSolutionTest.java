package org.edu_leetcode.easy.Length_of_Last_Word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordSolutionTest {
    private final LengthOfLastWordSolution solution = new LengthOfLastWordSolution();

    @Test
    void lengthOfLastWordCase1() {
        String s = "Hello World";
        assertEquals(5, solution.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWordCase2() {
        String s = "   fly me   to   the moon  ";
        assertEquals(4, solution.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWordCase3() {
        String s = "luffy is still joyboy";
        assertEquals(6, solution.lengthOfLastWord(s));
    }
}