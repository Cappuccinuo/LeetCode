Time spent :  15 min(Self)

GIVEN: an array of integers, and an array of queries

Note: For the `i`-th query `val = queries[i][0], index = queries[i][1]`, we add val to `A[index]`.  Then, the answer to the `i`-th query is the sum of the even values of `A`.

RETURNS: Return the answer to all queries.  Your `answer` array should have `answer[i]` as the answer to the `i`-th query.

EXAMPLES:

**Example 1:**

```
Input: A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
Output: [8,6,2,4]
Explanation: 
At the beginning, the array is [1,2,3,4].
After adding 1 to A[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.
After adding -3 to A[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.
After adding -4 to A[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.
After adding 2 to A[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.
```

Algorithm:

We get the initial even number sum at the beginning. Then every time we conduct the query, if that number is even number, we subtract it from even sum, then add the val, at last we judge again if it is even. 