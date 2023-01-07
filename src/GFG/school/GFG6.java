package GFG.school;

// Print 1 to N using loop

public class GFG6 {
  public static void main(String[] args) {
    GFG6.printNos(10);
  }

  static void printNos(int n){
    if(n > 0){
      printNos(n - 1);
      System.out.print(n);
      System.out.print(" ");
    }
  }
}
