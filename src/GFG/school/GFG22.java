package GFG.school;

// Palindrome

public class GFG22 {
  public static void main(String[] args) {
    System.out.println(is_palindrome(2020));
  }

  static String is_palindrome(int number) {
    String reversedString = giveReversedString(String.valueOf(number));
    boolean res = reversedString.equals(String.valueOf(number));
    return res ? "Yes" : "No";
  }

  static String giveReversedString(String s) {
    String reversedSring = "";
    for (int i = 0; i < s.length(); i++) {
      reversedSring += s.charAt(s.length() - 1 - i);

    }
    return reversedSring;
  }
}
