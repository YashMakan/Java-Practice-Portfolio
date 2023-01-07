package Leetcode.Arrays;

// 1528. Shuffle String

public class Leet14 {
  public static void main(String[] args) {
    System.out.println(new Leet14().restoreString("codeleet", new int[] { 4, 5, 6, 7, 0, 2, 1, 3 }));
  }

  public String restoreString(String s, int[] indices) {
    Character[] sAsList = new Character[indices.length];
    for (int i = 0; i < sAsList.length; i++) {
      sAsList[i] = s.charAt(indices[i]);
    }
    StringBuilder sb = new StringBuilder();

    for (Character ch : sAsList) {
      sb.append(ch);
    }

    String string = sb.toString();
    return string;
  }
}
