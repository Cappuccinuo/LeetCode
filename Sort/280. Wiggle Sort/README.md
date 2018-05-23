Time spent : 10 min(self)

Given: an unsorted array nums

Effect: reorder it in-place such that `nums[0] <= nums[1] >= nums[2] <= nums[3]...`.

For example, given `nums = [3, 5, 2, 1, 6, 4]`, one possible answer is `[1, 6, 2, 5, 3, 4]`.



Solution: 

Sort the array first, then swap elements pair-wise starting from the second element.

```
  [1, 2, 3, 4, 5, 6]
       ↑  ↑  ↑  ↑
       swap  swap

=> [1, 3, 2, 5, 4, 6]
```




Or we don't have to sort the array, when i is odd, we check if nums[i] > nums[i + 1], otherwise we swap. We check nums[i] < nums[i + 1] when i is even.