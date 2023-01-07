package GFG.school;

// Replace all 0's with 5

public class GFG31 {
  public static void main(String[] args) {
    System.out.println(convertFive(1004));
  }

  static int convertFive(int n) {
    return Integer.parseInt(String.valueOf(n).replace("0", "5"));
  }
}
