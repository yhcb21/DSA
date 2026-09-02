class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        int n = nums1.length;
        int m = nums2.length;
        int lo = 0;
        int hi = n;

        while (lo <= hi) {
            int cut1 = (lo + hi) / 2;
            int cut2 = (n + m + 1) / 2 - cut1;
            double l1 = (cut1 == 0) ? Double.NEGATIVE_INFINITY : nums1[cut1 - 1];
            double r1 = (cut1 == n) ? Double.POSITIVE_INFINITY : nums1[cut1];
            double l2 = (cut2 == 0) ? Double.NEGATIVE_INFINITY : nums2[cut2 - 1];
            double r2 = (cut2 == m) ? Double.POSITIVE_INFINITY : nums2[cut2];
            if (l1 <= r2 && l2 <= r1) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
            }
            else if (l1 > r2) {
                hi = cut1 - 1;
            }
            else {
                lo = cut1 + 1;
            }
        }

        return 0.0;
    }
}