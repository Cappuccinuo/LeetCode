Time spent : 20min(see hint for shuffle)

Shuffle a set of numbers without duplicates.

EXAMPLES:

```
// Init an array with set 1, 2, and 3.
int[] nums = {1,2,3};
Solution solution = new Solution(nums);

// Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
solution.shuffle();

// Resets the array back to its original configuration [1,2,3].
solution.reset();

// Returns the random shuffling of array [1,2,3].
solution.shuffle();
```



1. We can make two global variables array and origin, store current array and origin array respectively.

2. At the constructor part, we need to make a deep copy of nums and assign the deep copy to origin, and point current array to nums.

3. In the reset part, we just need to make a deep copy of origin, and return the origin. We need to reset array to origin.

4. In the shuffle part, we use the random method in Java. 

   **java.util.Random.nextInt(int n) **: The **nextInt(int n)** is used to get a random number between 0(inclusive) and the number passed in this argument(n), exclusive.

   So we just need to swap(a, i, i + random.nextInt(nums.length - i))

