package GFG.school;

// sum of AP

public class GFG77 {
  public static void main(String[] args) {
    System.out.println(new GFG77().sum_of_ap(486, 428, 845));
  }

  public long sum_of_ap(long n, long a, long d) {
    return (n / 2) * (2 * a + (n - 1) * d);
  }
}

// 243 * 856+ 409825