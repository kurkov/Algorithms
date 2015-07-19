/*
https://leetcode.com/problems/climbing-stairs/

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/

package leetcode.climbing_stairs;

import java.util.HashMap;

public class Solution {

    private HashMap<Integer, Integer> calculated;

    public int climbStairs(int n) {
        calculated = new HashMap<Integer, Integer>();
        calculated.put(1, 1);
        calculated.put(2, 2);

        return f(n);
    }

    private int f(int n) {

        if (calculated.containsKey(n)) {
            return calculated.get(n);
        }

        int res = f(n - 1) + f(n - 2);
        calculated.put(n, res);

        return res;
    }
}