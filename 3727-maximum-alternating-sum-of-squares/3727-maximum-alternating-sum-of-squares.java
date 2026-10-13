class Solution {
    public long maxAlternatingSum(int[] nums) {
        Arrays.sort(nums);
        long ans = 0;
        int n = nums.length;

        long[] squares = new long[n];
        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(squares);

        for (int i = 0; i < n; i++) {
            if (i < (n + 1) / 2) {
                ans += squares[n - 1 - i];
            } else {
                ans -= squares[n - 1 - i];
            }
        }

        return ans;
    }
}