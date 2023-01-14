package Leetcode.Arrays;

import java.util.Arrays;

// 1480. Running Sum of 1d Array

public class Leet4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Leet4().runningSum(new int[] { 1, 2, 3, 4 })));
    }

    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int sumSoFar = 0;
        for (int i = 0; i < nums.length; i++) {
            sumSoFar += nums[i];
            res[i] = sumSoFar;
        }
        return res;
    }
}
