package Leetcode.Arrays;

import java.util.Arrays;

// 2373. Largest Local Values in a Matrix

public class Leet17 {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(
        new Leet17().largestLocal(new int[][] {
            { 9, 9, 8, 1 },
            { 5, 6, 2, 6 },
            { 8, 2, 6, 4 },
            { 6, 2, 2, 2 }
        })));
  }

  public int[][] largestLocal(int[][] grid) {
    int n = grid.length;
    int[][] newGrid = new int[n - 2][n - 2];
    for (int i = 0; i < n - 2; i++) {
      for (int j = 0; j < n - 2; j++) {
        newGrid[i][j] = getMax(grid, i, j);
      }
    }

    return newGrid;
  }

  static int getMax(int[][] grid, int a, int b) {
    int maxNumber = 0;
    for (int i = a; i < a + 3; i++) {
      for (int j = b; j < b + 3; j++) {
        if(maxNumber < grid[i][j]){
          maxNumber = grid[i][j];
        }
      }
    }
    return maxNumber;
  }
}
