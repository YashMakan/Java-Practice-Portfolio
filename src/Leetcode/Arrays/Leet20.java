package Leetcode.Arrays;

// 1662 Check If Two String Arrays are Equivalent

public class Leet20 {
  public static void main(String[] args) {
    System.out.println(new Leet20().arrayStringsAreEqual(new String[] { "ab", "c" }, new String[] { "a", "bc" }));
  }

  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    String s1 = "";
    String s2 = "";
    for (int i = 0; i < word1.length; i++) {
      s1 += word1[i];
    }
    for (int j = 0; j < word2.length; j++) {
      s2 += word2[j];
    }
    return s1.equalsIgnoreCase(s2);
  }
}
