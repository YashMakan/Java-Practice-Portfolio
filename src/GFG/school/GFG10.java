package GFG.school;

import java.util.ArrayList;

// Armstrong numbers

// note:
// Armstrong number: ex - 371 is an armstrong number
// 3^3 + 7^3 + 1^3 = 371 -- YES

public class GFG10 {
  public static void main(String[] args) {
    int n = 372;
    System.out.println(armstrongNumber(n));
  }

  static ArrayList<Integer> convertIntAsArray(int n) {
    String numberAsString = String.valueOf(n);
    ArrayList<Integer> res = new ArrayList<>();
    for (int i = 0; i < numberAsString.length(); i++) {
      res.add(Character.getNumericValue(numberAsString.charAt(i)));
    }
    return res;
  }

  static String armstrongNumber(int n) {
    int res = 0;
    ArrayList<Integer> intToArray = convertIntAsArray(n);
    for (int i = 0; i < intToArray.size(); i++) {
      res += Math.pow(intToArray.get(i), 3);
    }
    return res == n ? "YES" : "NO";
  }
}
