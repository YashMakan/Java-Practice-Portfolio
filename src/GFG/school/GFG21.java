package GFG.school;

// Sum of Digit is Pallindrome or not

public class GFG21 {
  public static void main(String[] args) {
    System.out.println(isDigitSumPalindrome(57));
  }

  static int isDigitSumPalindrome(int N) {
    int res = 0;
    String nAsString = String.valueOf(N);
    for (int i = 0; i < nAsString.length(); i++) {
      res += Character.getNumericValue(nAsString.charAt(i));
    }
    return isNumberPalindrome(res) ? 1 : 0;
  }

  static boolean isNumberPalindrome(int number) {
    String reversedString = giveReversedString(String.valueOf(number));
    // new StringBuffer(String.valueOf(number)).reverse().toString();
    boolean res = reversedString.equals(String.valueOf(number));
    return res;
  }

  static String giveReversedString(String s) {
    String reversedSring = "";
    for (int i = 0; i < s.length(); i++) {
      reversedSring += s.charAt(s.length() - 1 - i);
    }
    return reversedSring;
  }
}
