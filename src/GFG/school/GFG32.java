package GFG.school;

public class GFG32 {
  public static void main(String[] args) {
    System.out.println(3^4);
    // int[] arr = { 1, 2, 3, 5, 3, 2, 1, 4, 5, 6, 6 };
    // findSingle(arr.length, arr);
  }

  static int findSingle(int N, int arr[]) {
    int ans = 0;

    for (int i = 0; i < N; i++) {
      ans ^= arr[i];
    }
    return ans;
  }
}
