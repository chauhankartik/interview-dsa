package org.example.arrays.one1D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n < 3) return null;
        List<List<Integer>> res = new ArrayList<>();
        // fix target
        for (int i = 0; i < n; i++) {
            if (i > 0 && (nums[i] == nums[i-1])) {
                continue;
            }
            int target = -nums[i];
            twoSum(nums, target, i+1, res);
        }
        return res;
    }

    public void twoSum(int[] nums, int target, int idx, List<List<Integer>> res) {
        int low = idx;
        int high = nums.length - 1;
        while(low < high) {
            int curr = nums[low] + nums[high];
            if(curr > target) high--;
            else if(curr < target) low++;
            else {
                // remove duplicated from either end
                while(low < high && nums[low] == nums[low+1]) low++;
                while(low  < high && nums[high] == nums[high - 1]) high--;
                res.add(new ArrayList<Integer>(Arrays.asList(-target, nums[low], nums[high])));
                low++;
                high--;
            }
        }
    }
}