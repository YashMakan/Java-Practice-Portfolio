package Leetcode.Arrays;

// 2367. Number of Arithmetic Triplets

public class Leet18 {
    public static void main(String[] args) {
        System.out.println(new Leet18().arithmeticTriplets(new int[] { 0,1,4,6,7,10 }, 3));
    }

    public int arithmeticTriplets(int[] nums, int diff) {
        int counter = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int b = -1;
            int c = -1;
            for (int j = i; j >= 0; j--) {
                if (nums[j] == nums[i] - diff) {
                    b = j;
                    for (int k = j; k >= 0; k--) {
                        if (nums[k] == nums[j] - diff) {
                            c = k;
                            break;
                        }
                    }
                }
            }
            if (b != -1 && c != -1) {
                counter++;
            }
        }
        return counter;
    }
}
