package GFG.school;

// 5. School - print the pattern set 1

public class GFG5 {
  public static void main(String[] args) {
    GFG5 gfg = new GFG5();
    gfg.printPat(3);
  }

  void printPat(int n) {
    for (int row = n; row > 0; row--) {
      for (int column = n; column > 0; column--) {
        for (int wordRepeat = 0; wordRepeat < row; wordRepeat++){
          System.out.printf("%d ", column);
        }
      }
      System.out.println();
    }
  }

}
