package GFG.school;

// GCD of two numbers

public class GFG35 {
  public static void main(String[] args) {
    System.out.println(gcd(3, 6));
  }

  // optimised
  public static int gcdUsingEuclidAlgorithm(int a, int b) {
    if (a == 0)
      return b;

    return gcdUsingEuclidAlgorithm(b % a, a);
  }

  public static int gcd(int A, int B) {
    return A * B / calculateLCM(A, B);
  }

  static int calculateLCM(int n1, int n2) {
    int lcm;
    lcm = (n1 > n2) ? n1 : n2;
    while (true) {
      if (lcm % n1 == 0 && lcm % n2 == 0) {
        break;
      }
      ++lcm;
    }
    return lcm;
  }
}
