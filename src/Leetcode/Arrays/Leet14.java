package Leetcode.Arrays;

// 1528. Shuffle String

public class Leet14 {
  public static void main(String[] args) {
    System.out.println(new Leet14().restoreString("codeleet", new int[] { 4, 5, 6, 7, 0, 2, 1, 3 }));
  }

  public String restoreString(String s, int[] indices) {
    char arr[] = new char[indices.length];
    for (int i = 0; i < indices.length; i++) {
      arr[indices[i]] = s.charAt(i);
    }
    return new String(arr);
  }
}
