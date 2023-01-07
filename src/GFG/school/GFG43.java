package GFG.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// swap two numbers

public class GFG43 {
  public static void main(String[] args) {
    System.out.println(GFG43.get(3, 2));
  }

  static List<Integer> get(int a, int b) {
    a = a + b;
    b = a - b;
    a = a - b;
    return new ArrayList<Integer>(Arrays.asList(a, b));
  }
}
