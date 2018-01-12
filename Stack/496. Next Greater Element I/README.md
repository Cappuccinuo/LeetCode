Time spent : 40min(See hint)

GIVEN: two arrays without duplicates nums1 and nums2

RETURNS: all the next greater number for nums1's elements in the corresponding places of nums2

EXAMPLES:

```
Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
Output: [-1,3,-1]
Explanation:
    For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
    For number 1 in the first array, the next greater number for it in the second array is 3.
    For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
```

```
Input: nums1 = [2,4], nums2 = [1,2,3,4].
Output: [3,-1]
Explanation:
    For number 2 in the first array, the next greater number for it in the second array is 3.
    For number 4 in the first array, there is no next greater number for it in the second array, so output -1.

```



Use pre-processing first to make the results easily available later on.

Hashmap is used to store the result for every possible number in nums in the form of (element, next_greater_element).

Iterate over nums array from left to right. Push nums[i] to stack if it is less than previous element on the top of stack. If we encounter nums[i] > stack.pop(), keep on poping the elements, until stack[k] < nums[i]. We can put stack.pop(), nums[i] in the hashmap. After the iteration, the rest of the elements are nums[i], -1.



Time complexity : O(m + n). m is the size of nums2, n is the stack's n elements. FindNum array also scaned once.

Space complexity : O(m + n). stack and map of size n is used. result array of size nums1.length m is used.