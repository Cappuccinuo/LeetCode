Time spent :  15 min(See hint)

GIVEN: an array A, we can perform a *pancake flip*: We choose some positive integer `**k** <= A.length`, then reverse the order of the first **k** elements of `A`.

RETURNS: Return the k-values corresponding to a sequence of pancake flips that sort `A`.  Any valid answer that sorts the array within `10 * A.length` flips will be judged as correct.

EXAMPLES:

**Example 1:**

```
Input: [3,2,4,1]
Output: [4,2,4,3]
Explanation: 
We perform 4 pancake flips, with k values 4, 2, 4, and 3.
Starting state: A = [3, 2, 4, 1]
After 1st flip (k=4): A = [1, 4, 2, 3]
After 2nd flip (k=2): A = [4, 1, 2, 3]
After 3rd flip (k=4): A = [3, 2, 1, 4]
After 4th flip (k=3): A = [1, 2, 3, 4], which is sorted. 
```

**Example 2:**

```
Input: [1,2,3]
Output: []
Explanation: The input is already sorted, so there is no need to flip anything.
Note that other answers, such as [3, 3], would also be accepted.
```

Algorithm:

Find the index i of the next maximum number x.

Reverse i + 1 numbers, so that the x will be at A[0].

Reverse x numbers, so that x will be at A[x - 1].

Repeat the process from N to 1.