package GFG.school;

// Binary Representation

public class GFG67 {
  public static void main(String[] args) {
    System.out.println(getBinaryRep(2));
  }

  static String getBinaryRep(int N) {
    String binString = Integer.toBinaryString(N);
    String res = "";
    for (int i = 0; i < 30 - binString.length(); i++) {
      res+="0";
    }
    res+=binString;
    return res;
  }
}
