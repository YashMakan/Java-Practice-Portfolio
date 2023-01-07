package GFG.school;

// nPr -> n! / (n-r)!

public class GFG37 {
  public static void main(String[] args) {
    System.out.println(nPr(2, 1));
  }

  static long nPr(long n, long r) {
    return calculateFactorial(n) / calculateFactorial(n - r);    
  }

  static long calculateFactorial(long i){
    if(i <= 1){
      return 1;
    }

    return calculateFactorial(i - 1) * i;
  }
}
