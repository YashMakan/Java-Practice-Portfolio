package GFG.school;

public class GFG7 {
  public static void main(String[] args) {
    int[] numbers = { 121, 131, 20 };
    areAllPalindromes(numbers);
  }

  static String giveReversedString(String s) {
    String reversedSring = "";
    for (int i = 0; i < s.length(); i++) {
      reversedSring += s.charAt(s.length() - 1 - i);
    }
    return reversedSring;
  }

  static boolean isNumberPalindrome(int number) {
    String reversedString = giveReversedString(String.valueOf(number));// new
                                                                       // StringBuffer(String.valueOf(number)).reverse().toString();
    boolean res = reversedString.equals(String.valueOf(number));
    return res;
  }

  static void areAllPalindromes(int[] numbers) {
    int areAllPalindromesBoolean = 0;
    for (int i = 0; i < numbers.length; i++) {
      boolean res = isNumberPalindrome(numbers[i]);
      if (!res) {
        break;
      } else if (i == numbers.length - 1) {
        areAllPalindromesBoolean = 1;
      }
    }
    System.out.println(areAllPalindromesBoolean);
  }

}
