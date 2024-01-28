package org.edu_leetcode.easy.Search_Insert_Position;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104

 */

//TODO Refactor
/*
if(left == right){
    return target > nums[left] ? left + 1: left;
}
---------------
return left;
 */
public class SearchInsertPositionSolution {
    public int searchInsert(int[] nums, int target) {
        int left = 0; //start index
        int right = nums.length - 1; //end index


        while (left <= right){

            if(left == right){
                return target > nums[left] ? left + 1: left;
            }

            int mid = right - ((right - left) / 2); //middle index

            if(target == nums[mid]) return mid;
            else if (target > nums[mid]) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }

       return left;
    }
}