package GFG.school;

// Series AP

public class GFG19 {
  public static void main(String[] args) {
    int A1 = 2;
    int A2 = 3;
    int N = 10;
    nthTermOfAP(A1, A2, N);
  }

  static int nthTermOfAP(int A1, int A2, int N) {
    int D = A2 - A1;
    int res = A1 + (N - 1) * D;
    return res;
  }
}
