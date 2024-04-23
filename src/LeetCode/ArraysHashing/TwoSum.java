package LeetCode.ArraysHashing;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (numMap.containsKey(difference)) {
                return new int[]{numMap.get(difference), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}