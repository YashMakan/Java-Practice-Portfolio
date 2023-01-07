package Leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// 1389. Create Target Array in the Given Order

public class Leet11 {
  public static void main(String[] args) {
    System.out.println(
        Arrays.toString(new Leet11().createTargetArray(new int[] { 0, 1, 2, 3, 4 }, new int[] { 0, 1, 2, 2, 1 })));
  }

  public int[] createTargetArray(int[] nums, int[] index) {
    ArrayList<Integer> target = new ArrayList<>();
    for (int i = 0; i < index.length; i++) {
      target.add(index[i], nums[i]);
    }
    for (int i = 0; i < nums.length; i++) {
      nums[i] = target.get(i);
    }
    return nums;
  }
}
