package GFG.school;

import java.util.regex.Pattern;

// Upper case conversion

public class GFG41 {
  public static void main(String[] args) {
    System.out.println(new GFG41().transform("i love programming"));
  }

  public String transform(String s) {
    String[] strings = s.split(Pattern.quote(" "));
    String res = "";
    for (String string : strings) {
      res += Character.toUpperCase(string.charAt(0)) + string.substring(1) + " ";
    }
    return res;
  }
}
