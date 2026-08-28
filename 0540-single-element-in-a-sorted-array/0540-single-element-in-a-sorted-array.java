class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        
        if (n == 1) {
            return nums[0];
        }

        if (nums[0] != nums[1]) {
            return nums[0];
        }

        if (nums[n-1] != nums[n-2]) {
            return nums[n-1];
        }

        int lo = 1;
        int hi = n-2;

        while (lo <= hi) {
            int m = (lo + hi) /2 ;
            if (nums[m] != nums[m-1] && nums[m] != nums[m+1]) {
                return nums[m];
            }

            if (nums[m] == nums[m-1]) {
                m= m-1;
            }

            if (m % 2 == 0) {
                lo = m + 2;
            }

            else {
                hi = m - 1; 
            }
        }
        return 0;
    }
}