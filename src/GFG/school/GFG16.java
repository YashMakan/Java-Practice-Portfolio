package GFG.school;

import java.util.Arrays;

// Print Elements of Array

public class GFG16 {
  public static void main(String[] args) {
    int[] arr = {2};
    printArray(arr, 1);
  }

  static void printArray(int arr[], int n){
    System.out.println(Arrays.toString(arr).replace(",", "")
        .replace("[", "")
        .replace("]", "")
        .trim());
  }
}
