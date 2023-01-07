package GFG.school;

import java.util.ArrayList;
import java.util.Arrays;

// At least two greater elements

public class GFG33 {
  public static void main(String[] args) {
    long[] a = { 2, 8, 7, 1, 5 };
    int n = a.length;
    System.out.println(findElements(a, n));
  }

  public static ArrayList<Long> findElements(long a[], long n) {
    Arrays.sort(a);
    ArrayList<Long> res = new ArrayList<>();
    for (int i = 0; i < n - 2; i++) {
      res.add(a[i]);
    }
    return res;
  }
}
