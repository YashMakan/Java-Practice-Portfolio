package GFG.school;

// Sum palindrome

public class GFG68 {
  public static void main(String[] args) {
    System.out.println(isSumPalindrome(23));
  }

  static long isSumPalindrome(long n) {
    int count = 0;
    long sum = 0;
    while (count < 5) {
      sum = n + reverseLong(n);
      if (isLongPalindrome(n)) {
        break;
      }
      count++;
    }
    return sum;
  }

  static boolean isLongPalindrome(long n) {
    return n == reverseLong(n);
  }

  static long reverseLong(long n) {
    return Long.parseLong(new StringBuilder(String.valueOf(n)).reverse().toString());
  }
}
