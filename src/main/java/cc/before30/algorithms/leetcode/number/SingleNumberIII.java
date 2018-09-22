package cc.before30.algorithms.leetcode.number;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberIII {

    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        Object[] temp = set.toArray();
        int[] ret = new int[2];
        ret[0] = (int)temp[0];
        ret[1] = (int)temp[1];
        return ret;
    }

}
