package Leetcode.Arrays;

import java.util.Arrays;

// 2367. Number of Arithmetic Triplets

public class Leet17 {
    public static void main(String[] args) {
        System.out.println(new Leet17().arithmeticTriplets(new int[]{0,1,4,6,7,10}, 3));
    }

    public int arithmeticTriplets(int[] nums, int diff) {
        var numClone = Arrays.asList(nums);
        int triplets = 0;
        for (int i = 0; i < nums.length; i++) {
            numClone.contains(nums[i] - diff);
        }
    }
}
