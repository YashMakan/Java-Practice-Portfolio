package Arrays;

// 1672. Richest Customer Wealth

public class Leet7 {
    public static void main(String[] args) {
        System.out.println(new Leet7().maximumWealth(new int[][] { { 1, 2, 3 }, { 3, 2, 1 } }));
    }

    public int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sumForThisBlock = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sumForThisBlock += accounts[i][j];
                if (sumForThisBlock > maxSum) {
                    maxSum = sumForThisBlock;
                }
            }
        }
        return maxSum;
    }
}
