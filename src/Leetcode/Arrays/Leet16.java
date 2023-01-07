package Leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;

// 1773. Count Items Matching a Rule

public class Leet16 {
    public static void main(String[] args) {
        List<List<String>> arr = new ArrayList<>();
        System.out.println(new Leet16().countMatches(arr, "color", "silver"));
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        int ruleIndex = ruleKey.equalsIgnoreCase("type") ? 0 : ruleKey.equalsIgnoreCase("color") ? 1 : 2;
        if (items.size() == 0) {
            return res;
        } else {
            for (int i = 0; i < items.size(); i++) {
                res += items.get(i).get(ruleIndex) == ruleValue ? 1 : 0;
            }
            return res;
        }
    }
}
