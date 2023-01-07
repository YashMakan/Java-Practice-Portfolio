package GFG.school;

public class GFG78 {
  public static void main(String[] args) {
    System.out.println(new GFG78().simpleInterest(100, 20, 2));
  }

  double simpleInterest(int P, int R, int T) {
    // Simple Interest = Principal*(Rate/100)*Time.
    return (double) (P * ((double) R / 100) * T);
  }
}
