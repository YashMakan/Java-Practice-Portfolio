package GFG.school;

// 3. School - Print alternate elements of an array

public class GFG3 {
  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4};
    GFG3.print(arr, arr.length);
  }

  public static void print(int arr[], int n) {
    for(int i = 0; i<arr.length; i=i+2){
      System.out.printf("%d ", arr[i]);
    }
  }
}
