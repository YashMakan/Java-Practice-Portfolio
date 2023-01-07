package GFG.school;

// Remove vowels in a string

public class GFG60 {
  public static void main(String[] args) {
    System.out.println(new GFG60().removeVowels("Geeks"));  
  }

  String removeVowels(String S){
    return S.replaceAll("[aeiouAEIOU]", "");
  }

  // slow method 
  String removeVowels2(String S) {
    String res = "";
    for (int i = 0; i < S.length(); i++) {
      if(!isVowel(S.charAt(i))){
        res+=S.charAt(i);
      }
    }
    return res;
  }

  static boolean isVowel(char c) {
    char s = Character.toLowerCase(c);
    return s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u';
  }
}
