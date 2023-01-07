package GFG.school;

// Multiple array

public class GFG79 {
  public static void main(String[] args) {
    System.out.println(GFG79.product(new int[]{1,2,3,4,5}, 5));
  }

  public static int product(int arr[], int n) {
    int mul = 1;
    for (int i = 0; i < n; i++) {
      mul *= arr[i];
    }
    return mul;
  }
}
