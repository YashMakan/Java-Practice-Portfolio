package GFG.school;

// 2. School - Value equal to index value

import java.util.ArrayList;

public class GFG2 {
  public static void main(String[] args) {
    ArrayList<Integer> output = new GFG2().valueEqualToIndex(new int[]{15, 2, 45, 12, 7}, 1);
    System.out.println(output);
  }
  ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
    ArrayList<Integer> res = new ArrayList<>();
    for (var i = 0; i < arr.length; i++) {
      if (arr[i] == i+1) {
        res.add(arr[i]);
      }
    }
    return res;
  }
}