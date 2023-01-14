package Leetcode.Arrays;

// 1588. Sum of All Odd Length Subarrays

public class Leet19 {
  public static void main(String[] args) {
    System.out.println(new Leet19().sumOddLengthSubarrays(new int[] { 1, 4, 2, 5, 3 }));
  }

  static int getSumFromRange(int[] arr, int start, int end) {
    int sum = 0;
    for(int i = start; i < end;i++){
      sum += arr[i];
  }
    return sum;
  }

  public int sumOddLengthSubarrays(int[] arr) {
    int sum = 0;
    for (int i = 1; i <= arr.length; i++) {
      if (i % 2 != 0) {
        for (int j = 0; j < arr.length; j++) {
          int start = j;
          if(i + j > arr.length){
            continue;
          }
          int end = i + j;
          int value = getSumFromRange(arr, start, end);
          sum += value;
        }
      }
    }
    return sum;
  }
}
