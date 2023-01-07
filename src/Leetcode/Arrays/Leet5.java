package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1470. Shuffle the Array

public class Leet5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Leet5().shuffle(new Integer[] { 2, 5, 1, 3, 4, 7 }, 3)));
    }

    public Object[] shuffle(Integer[] nums, int n) {
        List<Integer> list = Arrays.asList(nums);
        ArrayList<Integer> res = new ArrayList<>();
        int indexOfY1 = list.indexOf(n);
        for (int i = 0; i < indexOfY1; i++) {
            res.add(nums[i]);
        }
        int counter = 1;
        for (int i = 1; i <= indexOfY1; i++) {
            res.add(counter, nums[indexOfY1 + (i - 1)]);
            counter += 2;
        }
        return res.toArray();
    }
}
