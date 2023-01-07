package GFG.school;

// if-else decison making

public class GFG47 {
  public static void main(String[] args) {
    System.out.println(compareNM(8, 8));
  }

  static String compareNM(int n, int m) {
    return n > m ? "greater" : n < m ? "lesser" : "equal";
  }
}
