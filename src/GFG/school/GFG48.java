package GFG.school;

import java.util.Arrays;

// print the left element

public class GFG48 {
  public static void main(String[] args) {
    System.out.println(new GFG48().leftElement(new long[] { 7, 8, 3, 4, 2, 9, 5 }, 6));
  }

  public long leftElement(long arr[], long n) {
    Arrays.sort(arr);
    if (n % 2 == 0) {
      return arr[(int) n / 2];
    } else {
      return arr[(int) n / 2 - 1];
    }
  }
}
