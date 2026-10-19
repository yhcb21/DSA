
class Solution:
    def targetIndices(self, nums: list[int], target: int) -> list[int]:
        count = 0
        freq = 0

        for i in range(len(nums)):
            if nums[i] < target:
                count += 1
            elif nums[i] == target:
                freq += 1

        return list(range(count, count + freq))
