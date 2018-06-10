Time spent : 15 min

GIVEN: an array of seats. 1 represents a person sitting in that seat, and 0 represents that the seat is empty.

RETURNS: the maximum distance to closest person.

**Example 1:**

```
Input: [1,0,0,0,1,0,1]
Output: 2
Explanation: 
If Alex sits in the second open seat (seats[2]), then the closest person has distance 2.
If Alex sits in any other open seat, the closest person has distance 1.
Thus, the maximum distance to the closest person is 2.
```

**Example 2:**

```
Input: [1,0,0,0]
Output: 3
Explanation: 
If Alex sits in the last seat, the closest person is 3 seats away.
This is the maximum distance possible, so the answer is 3.
```



Make two array to represent the previous left person, and the next right person. 