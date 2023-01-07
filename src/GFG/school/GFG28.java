package GFG.school;

import java.util.ArrayList;

// Multiplication Table

public class GFG28 {
  public static void main(String[] args) {
    System.out.println(getTable(9));
  }

  static ArrayList<Integer> getTable(int N) {
    ArrayList<Integer> res = new ArrayList<>();
    for (int i = 1; i < 11; i++) {
      res.add(N * i);
    }
    return res;
  }
}
