package GFG.school;

import java.util.ArrayList;

// Perfect Arrays

public class GFG34 {
  public static void main(String[] args) {
    int[] a = {};
    int n = a.length;
    IsPerfect(a, n);
  }

  public static boolean IsPerfect(int a[], int n) {
    ArrayList<Integer> newA = reverseArray(a);
    for(int i = 0; i < n; i++){
      if(a[i] != newA.get(i)){
        return false;
      }
    }
    return true;
  }

  static ArrayList<Integer> reverseArray(int[] arr) {
    ArrayList<Integer> res = new ArrayList<>();
    for (int i = arr.length - 1; i >= 0; i--) {
      res.add(arr[i]);
    }
    return res;
  }
}
