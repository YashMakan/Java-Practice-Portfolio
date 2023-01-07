package GFG.school;

// SUm of Array

public class GFG13 {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4 };
    int length = numbers.length;
    printSumOfArrayUsingLoop(numbers, length);
  }

  static void printSumOfArrayUsingLoop(int[] numbers, int length) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    System.out.println(sum);
  }
}
