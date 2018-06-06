Time spent : 15 min(See hint)

Solution : TreeMap	

GIVEN: a hand of cards

RETURNS: true if we can rearrange the cards into groups so that each group is size `W`, and consists of `W` consecutive cards.


**Example 1:**

```
Input: hand = [1,2,3,6,2,3,4,7,8], W = 3
Output: true
Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8].
```

**Example 2:**

```
Input: hand = [1,2,3,4,5], W = 4
Output: false
Explanation: Alice's hand can't be rearranged into groups of 4.DESIGN STRATEGY: Use HashMap
```



Repeatly trying to form a set of cards by extracting the lowest card.

Notice that the problem require us to find the continuous array of numbers. So for a index base, we just need to find A[base], A[base + 1], A[base + 2]... A[base + W].If two of the adjacent numbers does not form a mountain, just return false.