package GFG.school;

// reverse digits

public class GFG15 {
  public static void main(String[] args) {
    long n = 100;
    System.out.println(reverse_digit(n));
  }

  static long reverse_digit(long n) {
    long res;
    String newString = "";
    String nAsString = String.valueOf(n);
    int nLength = nAsString.length();
    for (int i = 0; i < nLength; i++) {
      newString += nAsString.charAt((nLength - 1) - i);
    }
    res = Long.parseLong(newString);
    return res;
  }
}
