Time spent : 15 min(Self)

GIVEN: `persons[i]` at time `times[i]`.

RETURNS: `TopVotedCandidate.q(int t)` will return the number of the person that was leading the election at time `t`.  

Note: Votes cast at time `t` will count towards our query.  In the case of a tie, the most recent vote (among tied candidates) wins.

EXAMPLES:

```
Input: ["TopVotedCandidate","q","q","q","q","q","q"], [[[0,1,1,0,0,1,0],[0,5,10,15,20,25,30]],[3],[12],[25],[15],[24],[8]]
Output: [null,0,1,1,0,0,1]
Explanation: 
At time 3, the votes are [0], and 0 is leading.
At time 12, the votes are [0,1,1], and 1 is leading.
At time 25, the votes are [0,1,1,0,0,1], and 1 is leading (as ties go to the most recent vote.)
This continues for 3 more queries at time 15, 24, and 8.
```

Algorithm:

Using treemap, the key will be the time, and value will be current max vote person.

When call the topvoted function, we get the floor key towards t, and return the corresponding value.