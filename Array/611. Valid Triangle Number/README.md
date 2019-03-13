Time spent :  15 min

GIVEN: Given an array consists of non-negative integers

RETURNS: count the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

**Example 1:**

```
Input: [2,2,3,4]
Output: 3
Explanation:
Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
```

Algorithm:

First we can try DFS. But it will be very slow.

```java
class Solution {
    int res;
    
    public int triangleNumber(int[] nums) {
        res = 0;
        DFS(nums, 0, 0, 0, 0, 0);
        return res;
    }
    
    private void DFS(int[] nums, int index, int sum, int diff, int count, int next) {
        if (count == 3) {
            if (next < sum && next > diff) {
                res++;
            }
            return;
        }
        int i;
        for (i = index; i < nums.length; i++) {
            if (count == 0) {
                DFS(nums, i + 1, nums[i], nums[i], count + 1, 0);
            }
            if (count == 1) {
                DFS(nums, i + 1, sum + nums[i], Math.abs(diff - nums[i]), count + 1, 0);
            }
            if (count == 2) {
                DFS(nums, i + 1, sum, diff, count + 1, nums[i]);
            }
        }
    }
}
```

Actually we can first sort the array, and fix the largest side, find the other two side, the algo is similar as 3sum smaller.

```java
		 [2, 2, 3, 4]
         i = 3
         end = 3
         a = 0, b = 2
         sum = 5, diff = 1
         true: count += 2 - 0 (2, 3, 4) and (2, 3, 4)
         a = 0, b = 1
         sum = 4, diff = 0
         false
         i = 2
         end = 3
         a = 0, b = 1
         sum = 4, diff = 0
         true: count += 1 - 0 (2, 2, 3)
```

