package GFG.school;

// Reverse a string

public class GFG36 {
  public static void main(String[] args) {
    
  }

  static String reverseString(String s){
    String newString = "";
    for (int i = s.length() - 1; i >=0; i--) {
      newString += s.charAt(i);
    }
    return newString;
  }
}
