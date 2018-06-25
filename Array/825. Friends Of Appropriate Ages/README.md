Time spent :  20 min(see hint)

GIVEN: The list of ages and ages[i] is the age of the ith person

RETURNS: total friend requests are made

Note: 

Person A will NOT friend request person B (B != A) if any of the following conditions are true:

- `age[B] <= 0.5 * age[A] + 7`
- `age[B] > age[A]`
- `age[B] > 100 && age[A] < 100`



**Example 1:**

```
Input: [16,16]
Output: 2
Explanation: 2 people friend request each other.
```

**Example 2:**

```
Input: [16,17,18]
Output: 2
Explanation: Friend requests are made 17 -> 16, 18 -> 17.
```

**Example 3:**

```
Input: [20,30,100,110,120]
Output: 3
Explanation: Friend requests are made 110 -> 100, 120 -> 110, 120 -> 100.
```



Algorithm:

For each pair (ageA, countA), (ageB, countB), if the conditions are satisfied with respect to age, then countA * countB pairs of people made friend requests.

If ageA == ageB, we should have countA * (countA - 1) pairs of people as you cannot friend request yourself.