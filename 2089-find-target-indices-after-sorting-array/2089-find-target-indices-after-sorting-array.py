class Solution:
    def targetIndices(self, nums: list[int], target: int) -> list[int]:
        ans = []

        nums_sorted = sorted(nums)

        
        for i in range(0, len(nums)):
            
            if nums_sorted[i] == target:
                ans.append(i)

        return ans
        
        