class Solution:
    def search(self, nums: List[int], target: int) -> int:
        n = len(nums)
        lo = 0
        hi = n-1
        while lo <= hi:
            m = (lo + hi) // 2
            if nums[m] == target:
                return m
            if nums[m] < target:
                lo = m+1
            else:
                hi= m-1
        return -1
        
            