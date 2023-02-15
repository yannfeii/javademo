package com.sun.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Day001_TwoSum {
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]
    */

    public static void main(String[] args){
        /*
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        int[] nums = {3,2,4};
        int target = 6;
        int[] nums = {3,3};
        int target = 6;
         */
        int[] nums = {2,5,5,11};
        int target = 10;
        twoSum(nums,target);

    }
    public static int[] twoSum(int[] nums, int target){
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    System.out.println("indices_1 " + indices[0] + indices[1]);
                    return indices;
                }
            }
        }

        return new int[2];
    }

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for (int i = 0; i < n; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0];
        }
    }
    //
    class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hashtable = new HashMap<>();
            for (int i = 0; i < nums.length; ++i) {
                if (hashtable.containsKey(target - nums[i])) {
                    return new int[]{hashtable.get(target - nums[i]), i};
                }
                hashtable.put(nums[i], i);
            }
            return new int[0];
        }
    }
}
