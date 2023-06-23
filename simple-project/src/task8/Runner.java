package task8;

import java.util.HashMap;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        int[] nums = new int[]{3,3};
        int target = 6;
        int[] ints = twoSum(nums, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
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
