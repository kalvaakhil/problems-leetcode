class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        left = accumulate(islice(nums, len(nums) - 1), mul)
        right = accumulate(islice(reversed(nums), len(nums) - 1), mul)
        return list(map(mul, chain((1,), left), chain(reversed(tuple(right)), (1,))))
