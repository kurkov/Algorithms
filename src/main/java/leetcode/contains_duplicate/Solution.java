/*
Contains Duplicate
https://leetcode.com/problems/contains-duplicate/

Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
*/

package leetcode.contains_duplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer value = map.get(nums[i]);

            if (value == null) {
                map.put(nums[i], 1);
            } else {
                result = true;
                break;
            }
        }

        return result;
    }
}
