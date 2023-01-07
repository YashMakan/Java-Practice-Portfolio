package GFG.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// averaging in a stream

public class GFG57 {
  public static void main(String[] args) {

  }

  ArrayList<Float> streamAvg(int[] arr, int n) {
    final Iterable<Integer> iter = () -> Arrays.stream(arr).iterator();
    int count = 0;
    int sum = 0;
    ArrayList<Float> res = new ArrayList<>();
    Iterator<Integer> iterator = iter.iterator();
    while (iterator.hasNext()) {
      sum += iterator.next();
      count++;
      res.add((float) sum / count);
    }
    return res;
  }
}
