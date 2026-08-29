class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int m = (lo + hi) / 2;
            if (nums[m] == target) {
                return m;
            }
            else if(nums[lo] <= nums[m]) {
                if (nums[m] > target && nums[lo] <= target) {
                    hi = m - 1;
                } 
                else {
                    lo = m+1;
                }
            }
            else {
                if (nums[m] < target && nums[hi] >= target) {
                    lo = m+1;
                }
                else {
                    hi = m -1 ;
                }
            }
        }
        return -1;
        
        
    }
}