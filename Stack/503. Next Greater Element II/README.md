Time spent : 40min(See hint + self)

GIVEN: a circular array

RETURNS: the next greater number for every element

EXAMPLES:

```
Input: [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number; 
The second 1's next greater number needs to search circularly, which is also 2.
```



As it is a circular array, we can extend the array's traverse length to 2 * length.

The basic idea is push the index of num to stack, as there may be duplicate numbers. And only when i < num.length we push the index.

Use i % num.length to control the index.

            while (!stack.isEmpty() && nums[i % nums.length] > nums[stack.peek() % nums.length]) {
                result[stack.pop() % nums.length] = nums[i % nums.length];
            }
At last, don't forget to assign value to the index remain in the stack.