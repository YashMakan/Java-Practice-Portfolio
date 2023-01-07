package GFG.school;

// Print 1 to n without using loops

public class GFG30 {
  public static void main(String[] args) {
    print1ToN(9);
  }

  static void print1ToN(int n) {
    if (n <= 0) {
      return;
    }

    print1ToN(n - 1);
    System.out.print(n);
    System.out.print(" ");
  }
}
