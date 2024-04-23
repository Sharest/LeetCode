package LeetCode.ArraysHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};

        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Map <Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)&&map.get(num) >=1){
                return true;
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return false;

    }

}
