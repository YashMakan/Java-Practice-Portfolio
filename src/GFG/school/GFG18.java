package GFG.school;

// Display longest name

public class GFG18 {
  public static void main(String[] args) {
    String[] names = {};
    int n = names.length;
    longest(names, n);
  }

  static String longest(String names[], int n) {
    String maxWord = "";
    for(int i = 0; i < names.length; i++){
      if(names[i].length() > maxWord.length()){
        maxWord = names[i];
      }
    }
    return maxWord;
  }
}
