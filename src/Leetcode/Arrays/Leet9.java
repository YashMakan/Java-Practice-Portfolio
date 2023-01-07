package Leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;

// 1431. Kids With the Greatest Number of Candies

public class Leet9 {
  public static void main(String[] args) {
    System.out.println(new Leet9().kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3));
  }

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> result = new ArrayList<>(candies.length);
    int largestInt = 0;
    for (int candy : candies) {
      largestInt = Math.max(candy, largestInt);
    }
    for (int candy : candies) {
      result.add(candy >= largestInt - extraCandies);
    }
    return result;
  }
}
