package GFG.school;

// check string

public class GFG64 {
  public static void main(String[] args) {

  }

  Boolean check(String s) {
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(0) != s.charAt(i)) {
        return false;
      }
    }
    return true;
  }
}
