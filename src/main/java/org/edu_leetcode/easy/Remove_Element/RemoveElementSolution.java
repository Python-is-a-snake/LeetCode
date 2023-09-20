package org.edu_leetcode.easy.Remove_Element;

import java.util.Arrays;

public class RemoveElementSolution {
    /*
    Stream API solution (creates additional array)

    public int removeElement(int[] nums, int val) {
        int[] removed = Arrays.stream(nums).filter(num -> num != val).toArray();
        System.arraycopy(removed, 0, nums, 0, removed.length);
        return removed.length;
        }
     */

    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}