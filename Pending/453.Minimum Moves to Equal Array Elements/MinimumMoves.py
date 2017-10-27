class Solution(object):
  def minMoves(self,nums):
      """
      :type nums: List[int]
      :rtype: int
      """
      nums.sort()
      time = 0
      for i in range(len(nums)-1, -1, -1):
        if nums[i] == nums[0]:
          break
        time += nums[i] - nums[0]
      return time
