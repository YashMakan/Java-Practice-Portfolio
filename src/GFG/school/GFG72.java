package GFG.school;

// power of pow

public class GFG72 {
  public static void main(String[] args) {
    System.out.println(new GFG72().sum_of_square_evenNumbers(3));
  }

  public long sum_of_square_evenNumbers(long n) {
    long res = 0;
    for (int i = 2; i <= 2*n; i=i+2) {
      res+=Math.pow(i, 2);
    }
    return res;
  }
}
