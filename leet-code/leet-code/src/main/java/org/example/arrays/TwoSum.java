package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> secondInt = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (secondInt.containsKey(nums[i])) {
                return new int[]{secondInt.get(nums[i]), i};
            }
            secondInt.put(target - nums[i], i);
        }
        return new int[]{};
    }
}
