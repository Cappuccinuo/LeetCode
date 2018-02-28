Time spent : 5 min(self)

Given an array with *n* objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.



Use counting sort. Cause we know the range of elements is 0-2

Use two auxiliary arrays, one result used to store result, count used to record the frequency of each elements.