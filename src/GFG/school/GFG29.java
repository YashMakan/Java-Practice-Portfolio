package GFG.school;

import java.util.Arrays;

// find index

public class GFG29 {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 5 };
    int N = a.length;
    int key = 5;
    System.out.println(Arrays.toString(findIndex(a, N, key)));
  }

  static int[] findIndex(int a[], int N, int key) {
    int leftPointer = -1;
    int rightPointer = -1;
    for (int i = 0; i < N; i++) {
      if (a[i] == key) {
        leftPointer = i;
        break;
      }
    }

    for (int j = N - 1; j >= 0; j--) {
      if (a[j] == key) {
        rightPointer = j;
        break;
      }
    }

    return new int[] { leftPointer, rightPointer };
  }
}
