/*
https://leetcode.com/problems/search-insert-position/

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
*/


package leetcode.search_insert_position;

public class Solution {

    public int searchInsert(int[] nums, int target) {

        if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        return search(0, nums.length - 1, nums, target);
    }

    public int search(int start, int end, int[] nums, int target) {
        int mid;

        while (start < end) {
            mid = (start + end) / 2;

            if (target == nums[mid]) {
                return mid;
            }

            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

}
