package cc.before30.algorithms.leetcode.number;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    // non-empty array of integers
    // every element appears twice except for one. Find that single one.
    // Liner Time
    // without using extra memory
    public int singleNumber(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.remove(nums[i]);
            } else {
                map.put(nums[i], true);
            }
        }

        int ret = -1;
        for (Integer integer : map.keySet()) {
            ret = integer;
        }

        return ret;
    }

    public static void main(String[] args) {

    }
}
