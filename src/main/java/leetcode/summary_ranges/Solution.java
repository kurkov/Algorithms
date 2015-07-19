/*
*   https://leetcode.com/problems/summary-ranges/
*
*   Given a sorted integer array without duplicates, return the summary of its ranges.
*   For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
*/

package leetcode.summary_ranges;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums == null || nums.length == 0)
            return result;

        if (nums.length == 1) {
            result.add(nums[0] + "");
        }

        int previous = nums[0];
        int first = previous;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == previous + 1) {
                if (i == nums.length - 1) {
                    result.add(first + "->" + nums[i]);
                }
            } else {

                if (first == previous) {
                    result.add(first + "");
                } else {
                    result.add(first + "->" + previous);
                }

                if (i == nums.length - 1) {
                    result.add(nums[i] + "");
                }

                first = nums[i];
            }

            previous = nums[i];
        }

        return result;
    }
}