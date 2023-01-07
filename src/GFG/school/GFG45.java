package GFG.school;

// Java Strings | Set 1

public class GFG45 {
  public static void main(String[] args) {
    System.out.println(conRevstr("Geeks", "forGeeks"));
  }

  static String conRevstr(String S1, String S2) {
    return reverseString(S1 + S2);
  }

  static String reverseString(String s) {
    String res = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      res += s.charAt(i);
    }
    return res;
  }
}
