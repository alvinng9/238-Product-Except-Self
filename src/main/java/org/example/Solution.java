package org.example;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];

        pre[0] = nums[0];
        post[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            pre[i] = nums[i] * pre[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            post[i] = nums[i] * post[i + 1];
        }

        int[] result = new int[nums.length];
        for (int i = 1; i < nums.length - 1; i++) {
            result[i] = pre[i - 1] * post[i + 1];
        }
        result[0] = post[1];
        result[nums.length - 1] = pre[nums.length - 2];
        return result;
    }
}
