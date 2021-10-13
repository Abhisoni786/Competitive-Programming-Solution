import java.util.*;

public class Solution1 {

    // Main Method and import automatically handle by LeetCode

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int remain = target - n;
            if (map.containsKey(remain)) {
                return new int[] { map.get(remain), i };
            }

            map.put(n, i);
        }

        throw new IllegalArgumentException();
    }

}
