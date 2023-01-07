package GFG.school;

// count of camel case characters

public class GFG54 {
  public static void main(String[] args) {
    System.out.println(new GFG54().countCamelCase("ckjkUUYII"));
  }

  int countCamelCase(String s) {
    int res = 0;
    for (int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == Character.toUpperCase(s.charAt(i))){
        res++;
      }
    }
    return res;
  }
}
