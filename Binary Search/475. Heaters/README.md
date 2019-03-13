Time spent : 15 min(See hint)

GIVEN: array of houses and heaters

RETURNS: the minimum radius standard of heaters

Note: find out minimum radius of heaters so that all houses could be covered by those heaters.

EXAMPLES:

**Example 1:**

```
Input: [1,2,3],[2]
Output: 1
Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard, then all the houses can be warmed.
```

**Example 2:**

```
Input: [1,2,3,4],[1,4]
Output: 1
Explanation: The two heater was placed in the position 1 and 4. We need to use radius 1 standard, then all the houses can be warmed.
```

Algorithm:

For each house, using binary search to find the first heater located further than the house. (So need to sort heaters first).

Calculate the distance between house and left heater and the heater returned by binary search, pick the min one.

Time Complexity: Max(O(nlogn), O(mlogn)) m is the len of houses, n is the len of heaters