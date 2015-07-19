/*
https://leetcode.com/problems/combinations/

Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

For example,
If n = 4 and k = 2, a solution is:

[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]

*/

package leetcode.combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        if (k <= 0) {
            return result;
        }

        for (int i = n; i > 0; i--) {

            if (k == 1) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                result.add(list);
            } else {
                List<List<Integer>> subResult = combine(i - 1, k - 1);

                for (List<Integer> list : subResult) {
                    list.add(i);
                }

                result.addAll(subResult);
            }
        }

        return result;
    }
}