package GFG.school;

// Greatest of three numbers

public class GFG69 {
  public static void main(String[] args) {
    System.out.println(new GFG69().greatestOfThree(10, 3, 2));
  }

  int greatestOfThree(int A, int B, int C) {
    return A > B ? A > C ? A : C : B > C ? B : C;
  }
}
