class Solution {

    public int solve(int sum, int[] nums, int i){

        if(i == nums.length){
            if(sum == 0) return 1;
            return 0;
        }

        int take = 0;

        if(nums[i] <= sum){
            take = solve(sum - nums[i], nums, i + 1);
        }

        int notTake = solve(sum, nums, i + 1);

        return take + notTake;
    }

    public int findTargetSumWays(int[] nums, int target){

        int totalSum = 0;

        for(int num : nums){
            totalSum += num;
        }

        // if(totalSum < Math.abs(target)) return 0;

        if((totalSum + target) % 2 != 0) return 0;

        int sum1 = (totalSum + target) / 2;

        return solve(sum1, nums, 0);
    }
}