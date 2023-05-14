class ValidPartitionForTheArray {
    public boolean validPartition(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n+1];

        dp[0] = true;
        dp[1] = false;
        dp[2] = (nums[0] == nums[1]);

        for(int i=3; i<=n; i++)
        {
            dp[i] = (nums[i-1] == nums[i-2] && dp[i-2]) ||
                    (nums[i-1] == nums[i-2] && nums[i-2] == nums[i-3] && dp[i-3]) ||
                    (nums[i-1] == nums[i-2]+1 && nums[i-2] == nums[i-3]+1 && dp[i-3]);
        }

        return dp[n];
        
    }
}
