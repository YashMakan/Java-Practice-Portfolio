package GFG.school;

// find nth term 

public class GFG73 {
  public static void main(String[] args) {
    System.out.println(findNthTerm(4));
  }

  static int findNthTerm(int n) {
    int res = 0;
    for(int i = 1; i <= n; i++){
      res=res+i;
    }
    return res;
  }
}
