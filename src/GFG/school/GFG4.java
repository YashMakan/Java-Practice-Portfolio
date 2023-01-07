package GFG.school;

// 4. School - Sum of series

public class GFG4 {
  public static void main(String[] args) {
    long res = new GFG4().seriesSum(5);
    System.out.println(res);
  }

  long seriesSumSlow(int n) {
    int totalRes = 0;
    for (int i = 1; i < n + 1; i++) {
      totalRes += i;
    }
    return totalRes;
  }

  long seriesSum(int n) {
    long totalRes = ((long)n * ((long)n + 1)) / 2;
    return totalRes;
  }

}
