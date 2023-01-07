package GFG.school;

// Odd or even

public class GFG42 {
  public static void main(String[] args) {
    System.out.println(GFG42.oddEven(2));
  }

  static String oddEven(int N) {
    return N % 2 == 0 ? "even" : "odd";
  }
}
