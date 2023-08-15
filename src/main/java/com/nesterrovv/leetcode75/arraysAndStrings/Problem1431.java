package com.nesterrovv.leetcode75.arraysAndStrings;

import java.util.LinkedList;
import java.util.List;

class Problem1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        List<Boolean> result = new LinkedList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= maxCandies);
        }
        return result;
    }

}