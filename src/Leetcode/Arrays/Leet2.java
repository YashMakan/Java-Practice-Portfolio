package Arrays;

import java.util.Arrays;

// 1929. Concatenation of Array

public class Leet2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Leet2().getConcatenation(new int[] { 1, 2, 1 })));
    }

    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        for(int i = 0; i < nums.length; i++){
            res[i] = nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            res[nums.length + i] = nums[i];
        }
        return res;
    }
}
