package GFG.school;

// java arrays | set 1

public class GFG44 {
  public static void main(String[] args) {
    System.out.println(new GFG44().average(new int[]{1, 2, 3, 4, 5}, 4));
  }

  String average(int A[], int N) {
    int sum = 0;
    for(int item : A){
      sum += item;
    }

    return String.format("%d %.2f", sum, (float) sum / A.length);
  }
}
