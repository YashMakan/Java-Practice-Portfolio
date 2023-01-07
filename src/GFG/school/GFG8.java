package GFG.school;

// Arrays (Sum of array)

public class GFG8 {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4 };
    // printSumOfArrayUsingLoop(numbers, numbers.length);
    System.out.println(printSumOfArrayUsingRecursion(numbers, numbers.length));
  }

  static int printSumOfArrayUsingRecursion(int[] numbers, int length) {
    if (length <= 0) {
      return 0;
    }
    return printSumOfArrayUsingRecursion(numbers, length - 1) + numbers[length - 1];
  }

  static void printSumOfArrayUsingLoop(int[] numbers, int length) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    System.out.println(sum);
  }
}
