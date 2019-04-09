Time spent :  5 min(See hint)

GIVEN: You are given two jugs with capacities *x* and *y* litres. There is an infinite amount of water supply available. 

RETURNS:You need to determine whether it is possible to measure exactly *z* litres using these two jugs.

Note:

If *z* liters of water is measurable, you must have *z* liters of water contained within **one or both buckets** by the end.

Operations allowed:

- Fill any of the jugs completely with water.
- Empty any of the jugs.
- Pour water from one jug into another till the other jug is completely full or the first jug itself is empty.

EXAMPLES:

**Example 1:** (From the famous [*"Die Hard"* example](https://www.youtube.com/watch?v=BVtQNK_ZUJg))

```
Input: x = 3, y = 5, z = 4
Output: True
```

**Example 2:**

```
Input: x = 2, y = 6, z = 5
Output: False
```

Algorithm:

<https://en.wikipedia.org/wiki/B%C3%A9zout%27s_identity>

Bézout's identity (also called Bézout's lemma) is a theorem in the elementary theory of numbers:

let a and b be nonzero integers and let d be their greatest common divisor. Then there exist integers x and y such that ax+by=d

In addition, the greatest common divisor d is the smallest positive integer that can be written as ax + by every integer of the form ax + by is a multiple of the greatest common divisor d.