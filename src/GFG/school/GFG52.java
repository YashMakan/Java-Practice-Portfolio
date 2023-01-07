package GFG.school;

// remove alternate characters

public class GFG52 {
  public static void main(String[] args) {
    System.out.println(delAlternate("Geeks"));
  }

  static String delAlternate(String S) {
    String res = "";
    for(int i = 0; i < S.length(); i=i+2){
      res+=S.charAt(i);
    }
    return res;
  }
}
