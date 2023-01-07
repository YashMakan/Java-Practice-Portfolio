package GFG.school;

// Smaller and larger

public class GFG39 {
  public static void main(String[] args) {

  }

  int[] getMoreAndLess(int[] arr, int n, int x) {
    int less = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] <= less){
        less++;
      }else{
        break;
      }
    }
    return new int[]{less,  n - less};
  }
}
