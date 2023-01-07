package GFG.school;

// sum of digits

public class GFG49 {
  public static void main(String[] args) {
    System.out.println(sumOfDigits(12));
  }

  static int sumOfDigits(int N) {
    int res = 0;
    for(int i = 0; i < String.valueOf(N).length(); i++){
      res += Character.getNumericValue(String.valueOf(N).charAt(i));
    }
    return res;
  }
}
