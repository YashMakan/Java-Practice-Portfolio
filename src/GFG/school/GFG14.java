package GFG.school;

import java.util.Arrays;

public class GFG14 {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int k = 3;
    swapKth(numbers, numbers.length, k);
  }

  static void swapKth(int arr[], int n, int k) {
    int valueToReplace = arr[k - 1];
    arr[k - 1] = arr[n - k];
    arr[n - k] = valueToReplace;
    System.out.println(Arrays.toString(arr).replace(",", "")
        .replace("[", "")
        .replace("]", "")
        .trim());
  }
}
