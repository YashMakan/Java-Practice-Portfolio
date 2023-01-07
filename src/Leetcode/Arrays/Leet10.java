package Leetcode.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 1365. How Many Numbers Are Smaller Than the Current Number

public class Leet10 {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(new Leet10().smallerNumbersThanCurrent(new int[] { 8, 1, 2, 2, 3 })));
  }

  public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] res = new int[nums.length];

    int[] copyNums = nums.clone();
    Arrays.sort(copyNums);
    Map<Integer, Integer> numsAsMap = new HashMap<>();
    for (int j = 0; j < copyNums.length; j++) {
      numsAsMap.putIfAbsent(copyNums[j], j);
    }
    for (int i = 0; i < nums.length; i++) {
      res[i] = (numsAsMap.get(nums[i]));
    }
    return res;
  }
}
