package org.edu_leetcode.easy.Search_Insert_Position;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionSolutionTest {
    private final SearchInsertPositionSolution solution = new SearchInsertPositionSolution();

    @Test
    void insertPositionCase1(){
        int[] nums = {1,3,5,6};
        int target = 5;
        assertEquals(2, solution.searchInsert(nums, target));
    }
    @Test
    void insertPositionCase2(){
        int[] nums = {1,3,5,6};
        int target = 2;
        assertEquals(1, solution.searchInsert(nums, target));
    }

    @Test
    void insertPositionCase3(){
        int[] nums = {1,3,5,6};
        int target = 7;
        assertEquals(4, solution.searchInsert(nums, target));
    }

}