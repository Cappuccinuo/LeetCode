Time spent :  15 min(Self)

GIVEN: an array with positive and negative numbers

RETURNS: the maximum average subarray which length should be greater or equal to given length k

EXAMPLES:

Given nums = `[1, 12, -5, -6, 50, 3]`, k = `3`

Return `15.667` // (-6 + 50 + 3) / 3 = 15.667

Algorithm:

First we can think how to solve maximum subarray. We just need to traverse the array, and using the prefix sum. Everytime we use a variable max to get the max between max and current sum, and update sum to max of sum and 0, cause we don't want to add negative.

Then we can think how to solve maximum subarray with length at least k. We can just keep tracking of the min before nums[i - k].

For this problem, we "guess" the average. And to avoid average's effect on numbers, we substract every num in array with average. That will transfer the problem to maximum subarray with length at least k.

For example, [1, 12, -5, -6, 50, 3]. If we guess the average is 15, we substract every num with 15. That become [-14, -3, -20, -21, 35, -12]. We can find that the sum of subarray -21, 35, -12, is larger than 0. So that one is possible if k is 3.

To sum up, our problem has been turned into find the last average that makes  maximum subarray with length at least k is larger than 0 to be true.