class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2,
                                 int k1, int k2) {

        int n = nums1.length;
        long k = (long) k1 + k2;

        int[] diff = new int[n];
        int maxDiff = 0;
        long total = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            maxDiff = Math.max(maxDiff, diff[i]);
            total += diff[i];
        }

        if (k >= total) return 0;

        int low = 0, high = maxDiff;

        while (low < high) {
            int mid = low + (high - low) / 2;
            long needed = 0;

            for (int d : diff) {
                if (d > mid) {
                    needed += d - mid;
                }
            }

            if (needed <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        int level = low;
        long used = 0;
        long answer = 0;

        for (int d : diff) {
            used += Math.max(0, d - level);
            int reduced = Math.min(d, level);
            answer += (long) reduced * reduced;
        }

        long remaining = k - used;

        for (int d : diff) {
            if (remaining == 0) break;

            if (d >= level) {
                answer -= (long) level * level;
                answer += (long) (level - 1) * (level - 1);
                remaining--;
            }
        }

        return answer;
    }
}