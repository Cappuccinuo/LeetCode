Time spent :  10 min(See hint)

GIVEN: the i-th person has weight people[i], each boat can carry a maximum weight of limit

RETURNS: the minimum number of boats to carry every given person.

EXAMPLES:

**Example 1:**

```
Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
```

**Example 2:**

```
Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
```

**Example 3:**

```
Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)
```

Algorithm:

If the heaviest person can share a boat with the lightest person, then they can use one boat. Otherwise they use their own boat.