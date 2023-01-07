package GFG.school;

import java.util.Arrays;

// Mean

public class GFG75 {
  public static void main(String[] args) {
    System.out.println(mean(4, new int[] { 56, 67, 30, 79 }));
  }

  static int mean(int N, int[] A) {
    return (int) Arrays.stream(A).sum() / N;
  }
}
