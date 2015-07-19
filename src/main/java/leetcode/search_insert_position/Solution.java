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
