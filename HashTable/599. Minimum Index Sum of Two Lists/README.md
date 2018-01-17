Time spent : 15 min(self)

GIVEN: two string arrays

RETURNS: minimum index sum of same string

EXAMPLES:

```
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".
```

```
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["KFC", "Shogun", "Burger King"]
Output: ["Shogun"]
Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
```

1. Use hashmap to store sum i+j and corresponding string list.

   Time and space complexity: O(l1 * l2 * x), x is average string length.

2. Or use hashmap to store one of the string array. Traverse the other array and calculate the index sum. If sum < minSum, clear the current list using list.clear()

   Time complexity: l1 + l2

   Space complexity: O(l1 * x)
