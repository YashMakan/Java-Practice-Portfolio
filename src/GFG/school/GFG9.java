package GFG.school;
import java.util.Arrays;

// Find the median

public class GFG9 {
  public static void main(String[] args) {
    int[] numbers = { 19, 11 };
    findTheMedianInArray(numbers);
  }

  static void findTheMedianInArray(int[] numbers) {
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));
    int numbersLength = numbers.length;
    boolean isLengthEven = numbersLength % 2 == 0;
    if (isLengthEven) {
      System.out.println((numbers[(int) numbersLength / 2] + numbers[((int) numbersLength / 2) - 1]) / 2);
    } else {
      System.out.println(numbers[(int) numbersLength / 2]);
    }
  }
}
