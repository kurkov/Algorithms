/*
Contains Duplicate II
https://leetcode.com/problems/contains-duplicate-ii/

Given an array of integers and an integer k, find out whether there there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
*/

package leetcode.contains_duplicate_ii;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int valueI = nums[i];
            int count;

            if (map.get(valueI) == null) {
                map.put(valueI, 1);
            } else {
                count = map.get(valueI);
                map.put(valueI, count + 1);

                if (count + 1 > 1) {

                    for (int j = i - 1; j >= 0; j--) {
                        int valueJ = nums[j];

                        if ((valueI == valueJ) && (i - j <= k)) {
                            return true;
                        }
                    }
                }
            }

        }

        return result;
    }
}
