/*
Subsets
https://leetcode.com/problems/subsets/

Given a set of distinct integers, nums, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]

*/

package leetcode.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            subsets(nums[i]);
        }

        return result;
    }

    void subsets(int value) {
        if (result.isEmpty()) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            list2.add(value);
            Collections.addAll(result, list1, list2);
        } else {
            int length = result.size();

            for (int i = 0; i < length; i++) {
                List<Integer> internalList = new ArrayList<>(result.get(i));
                internalList.add(value);
                result.add(internalList);
            }
        }
    }
}