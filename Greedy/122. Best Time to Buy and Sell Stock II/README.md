Time spent : 5 min(See a little hint)

GIVEN: an array

RETURNS: maximum profit

EXAMPLES:

```
Input: [7, 5, 6, 4, 5, 8, 10]
Output: 7
```



1. We can plot a picture to see the trend.

2. If the nums[i] > nums[i - 1], we can add their difference.

3. Or we can find peek and valley to do the math.

4. We can see from the picture, that the max profit is the sum of consecutive peak and valley

   ![](https://leetcode.com/media/original_images/122_maxprofit_2.PNG)

