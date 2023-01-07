package GFG.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Java switch case statement

public class GFG81 {
  public static void main(String[] args) {
    System.out.println(GFG81.switchCase(1, new ArrayList<Double>(Arrays.asList(2d))));
  }

  static double switchCase(int choice, List<Double> arr) {
    double res = -1;
    switch(choice){
      case 1:
        res = Math.PI * arr.get(0) * arr.get(0);
        break;
      case 2:
        res = arr.get(0) * arr.get(1);
        break;
    }
    return res;
  }
}
