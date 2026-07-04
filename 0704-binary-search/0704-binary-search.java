class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0;
        int hi = n-1;

        while (lo<=hi) {
            int m = (lo +hi)/2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] <= target){
                lo = m+1;
            }
            else {
                hi=m-1;
            }
        }
        return -1;
        
    }
}