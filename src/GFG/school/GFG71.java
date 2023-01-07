package GFG.school;

// vowel or not

public class GFG71 {
  public static void main(String[] args) {
    System.out.println(new GFG71().isVowel('h'));
  }

  String isVowel(char c) {
    return c == Character.toLowerCase('a') || c == Character.toLowerCase('e') || c == Character.toLowerCase('i')
        || c == Character.toLowerCase('o') || c == Character.toLowerCase('u') ? "YES" : "NO";
  }
}
