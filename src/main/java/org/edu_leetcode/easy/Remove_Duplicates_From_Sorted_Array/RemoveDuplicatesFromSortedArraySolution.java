package org.edu_leetcode.easy.Remove_Duplicates_From_Sorted_Array;

public class RemoveDuplicatesFromSortedArraySolution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

}
