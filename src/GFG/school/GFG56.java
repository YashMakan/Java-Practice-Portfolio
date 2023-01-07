package GFG.school;

// sum of elements in a matrix

public class GFG56 {
  public static void main(String[] args) {
    System.out.println(new GFG56().sumOfMatrix(2, 3, new int[][]{{1, 0, 1}, {-8, 9, -2}}));
  }

  int sumOfMatrix(int rows, int cols, int[][] arr) {
    int res = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        res += arr[i][j];
      }
    }
    return res;
  }
}
