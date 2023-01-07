package Leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// 1313. Decompress Run-Length Encoded List

public class Leet13 {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(new Leet13().decompressRLElist(new int[] { 1, 2, 3, 4 })));
  }

  public int[] decompressRLElist(int[] nums) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < nums.length; i = i + 2) {
      int freq = nums[i];
      int val = nums[i + 1];
      for (int j = 0; j < freq; j++) {
        arrayList.add(val);
      }
    }

    int[] res = new int[arrayList.size()];
    for (int i = 0; i < res.length; i++) {
      res[i] = arrayList.get(i);
    }
    return res;
  }
}
