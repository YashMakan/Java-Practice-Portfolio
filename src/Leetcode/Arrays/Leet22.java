package Leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// 2500. Delete Greatest Value in Each Row

public class Leet22 {
  public static void main(String[] args) {
    System.out.println(new Leet22().deleteGreatestValue(new int[][] {
        { 1, 2, 4 },
        { 3, 3, 1 }
    }));
  }

  public int deleteGreatestValue(int[][] grid) {
    for (int i = 0; i < grid.length; i++)
      Arrays.sort(grid[i]);
    int res = 0;
    for (int i = 0; i < grid[0].length; i++) {
      int max = 0;
      for (int j = 0; j < grid.length; j++)
        max = Math.max(max, grid[j][i]);
      res += max;
    }
    return res;
  }
}
