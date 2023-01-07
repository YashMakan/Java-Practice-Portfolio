package GFG.school;

public class GFG66 {
  public static void main(String[] args) {
    System.out.println(new GFG66().chartostr(new char[] { 'g', 'e', 'e', 'k', 's' }, 5));
  }

  public String chartostr(char arr[], int N) {
    String res = "";
    for (char c : arr) {
      res += c;
    }
    return res;
  }
}
