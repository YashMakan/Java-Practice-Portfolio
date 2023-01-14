package Leetcode.Arrays;

// 2011. Final Value of Variable After Performing Operations

public class Leet3 {
    public static void main(String[] args) {
        System.out.println(new Leet3().finalValueAfterOperations(new String[] { "--X", "X++", "X++" }));
    }

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("-")) {
                x--;
            } else {
                x++;
            }
        }
        return x;
    }
}
