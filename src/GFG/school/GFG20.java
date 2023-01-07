package GFG.school;

// Remove spaces

public class GFG20 {
  public static void main(String[] args) {
    String s = "yash makan";
    System.out.println(modify(s));
  }

  static String modify(String s){
    return s.replace(" ", "");
  }
}
