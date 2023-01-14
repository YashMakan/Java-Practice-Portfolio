package Leetcode.Arrays;

import java.util.HashMap;
import java.util.Map;

// 1512. Number of Good Pairs

public class Leet6 {
    public static void main(String[] args) {
        System.out.println(new Leet6().numIdenticalPairs(new int[] { 1, 2, 3, 1, 1, 3, 3}));
    }

    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int a : nums) {
            System.out.println(count);
            int cur = count.getOrDefault(a, 0);
            System.out.println(cur);
            res += cur;
            count.put(a, cur + 1);
        }
        return res;
    }
}
