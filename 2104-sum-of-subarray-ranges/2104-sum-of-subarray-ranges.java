class Solution {
    public long subArrayRanges(int[] nums) {
        
        long ans = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int max = nums[i]; int min = nums[i];
                for (int k = i;k <= j; k++) {
                    max = Math.max( max, nums[k]);
                    min = Math.min ( min , nums[k]);
                } 
                ans += max - min;
            }
        }
        return ans;
    }
}