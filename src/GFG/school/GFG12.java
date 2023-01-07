package GFG.school;

// Count of smaller elements

public class GFG12 {
  public static void main(String[] args) {
    long[] arr = { 1, 2, 4, 5, 8, 10 };
    int x = 9;
    System.out.println(GFG12.countOfElements(arr, arr.length, x));
  }

  static long countOfElements(long arr[], long n, long x) {
    long res = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] <= x) {
        res += 1;
      }else{
        break;
      }
    }
    return res;
  }
}
