class Solution {
    public int[] numberGame(int[] nums) {
        // Sort the input array
        Arrays.sort(nums);

        // Swap every adjacent pair
        for (int i = 0; i < nums.length; i += 2) { 
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }

        return nums;
    }
}