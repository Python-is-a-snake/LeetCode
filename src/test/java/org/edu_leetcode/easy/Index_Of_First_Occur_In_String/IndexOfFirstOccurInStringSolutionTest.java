package org.edu_leetcode.easy.Index_Of_First_Occur_In_String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class IndexOfFirstOccurInStringSolutionTest {

    private final IndexOfFirstOccurInStringSolution solution = new IndexOfFirstOccurInStringSolution();

    @Test
    void shouldNotGoOutOfBounds(){
        String haystack = "ll";
        String needle = "hello";
        assertEquals(-1, solution.strStr(haystack, needle));
    }

    @Test
    void indexOfFirstOccurTestCase1() {
        String haystack = "hello";
        String needle = "ll";
        assertEquals(2, solution.strStr(haystack, needle));
    }

    @Test
    void indexOfFirstOccurTestCase2(){
        String haystack = "mississippi";
        String needle = "issipi";
        assertEquals(-1, solution.strStr(haystack, needle));
    }

    @Test
    void indexOfFirstOccurTestCase3() {
        String haystack = "helll";
        String needle = "lll";
        assertEquals(2, solution.strStr(haystack, needle));
    }
}