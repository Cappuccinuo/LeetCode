Time spent :  5 min(Self)

GIVEN: a set of items, the `i`-th item has value `values[i]` and label `labels[i]`.

Then, we choose a subset `S` of these items, such that:

- `|S| <= num_wanted`
- For every label `L`, the number of items in `S` with label `L` is `<= use_limit`

RETURNS: the largest possible sum of the subset `S`

EXAMPLES:

**Example 1:**

```
Input: values = [5,4,3,2,1], labels = [1,1,2,2,3], num_wanted = 3, use_limit = 1
Output: 9
Explanation: The subset chosen is the first, third, and fifth item.
```

**Example 2:**

```
Input: values = [5,4,3,2,1], labels = [1,3,3,3,2], num_wanted = 3, use_limit = 2
Output: 12
Explanation: The subset chosen is the first, second, and third item.
```

**Example 3:**

```
Input: values = [9,8,8,7,6], labels = [0,0,0,1,1], num_wanted = 3, use_limit = 1
Output: 16
Explanation: The subset chosen is the first and fourth item.
```

**Example 4:**

```
Input: values = [9,8,8,7,6], labels = [0,0,0,1,1], num_wanted = 3, use_limit = 2
Output: 24
Explanation: The subset chosen is the first, second, and fourth item.
```

Algorithm:

It is relatively hard to understand the meaning of the problem. The final result should count the largest sum of the values. The num_wanted is the num of items we add together. And the use_limit means, the number of num we use with label L should not exceed use_limit. 

This problem can be solved by greedy. As we always want to pick the number with largest value, regardless of the label number we use already.