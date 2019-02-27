Time spent :  5 min(Self)

GIVEN: a party with n people from 0 to n - 1. Only one celebrity. Every other n - 1 people know him/her but he does not know any of others. knows(a, b) return 1 if a knows b. Otherwise 0.

RETURNS: the celebrity. Otherwise -1.

EXAMPLES:

**Example 1:**

```
Input: graph = [
  [1,1,0],
  [0,1,0],
  [1,1,1]
]
Output: 1
Explanation: There are three persons labeled with 0, 1 and 2. graph[i][j] = 1 means person i knows person j, otherwise graph[i][j] = 0 means person i does not know person j. The celebrity is the person labeled as 1 because both 0 and 2 know him but 1 does not know anybody.
```

**Example 2:**

```
Input: graph = [
  [1,0,1],
  [1,1,0],
  [0,1,1]
]
Output: -1
Explanation: There is no celebrity.
```

Algorithm:

First round, we can select a candidate. In a graph, this point will have no incoming edge.

In our problem, we will go through 0 to n - 1, if know(candidate, person), we update the candidate as the person. As the others before person is not know by our candidate, so they cannot be the celebrity. After the first traverse, we have a potential candidate.

Then we traverse again, we check two things: 1. If the candidate knows others, return -1. 2. If others do not know the candidate, return -1.