package Leetcode.Arrays;

import java.util.Arrays;

// 1920. Build Array from Permutation

public class Leet1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Leet1().buildArray(new int[]{0, 2, 1, 5, 3, 4})));
    }

    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            res[i] = nums[nums[i]];
        }
        return res;
    }
    
}