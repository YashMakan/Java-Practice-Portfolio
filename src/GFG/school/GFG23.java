package GFG.school;

// Count digits

public class GFG23 {
  public static void main(String[] args) {
    System.out.println(evenlyDivides(12));
  }

  static int evenlyDivides(int N) {
    String S = String.valueOf(N);
    int res = 0;
    for (int i = 0; i < S.length(); i++) {
      if (Character.getNumericValue(S.charAt(i)) == 0 && N % Character.getNumericValue(S.charAt(i)) == 0) {
        res++;
      }
    }
    return res;
  }
}
