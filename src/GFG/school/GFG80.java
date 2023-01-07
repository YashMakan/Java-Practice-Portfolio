package GFG.school;

// Java substring

public class GFG80 {
  public static void main(String[] args) {
    System.out.println(GFG80.javaSub("cdbkdub", 0, 5));
  }

  static String javaSub(String S, int L, int R) {
    return S.substring(L, R+1);
  }
}
