Time spent :  30 min(See hint)

GIVEN: N exam room

Return a class `ExamRoom(int N)` that exposes two functions: `ExamRoom.seat()` returning an `int` representing what seat the student sat in, and `ExamRoom.leave(int p)` representing that the student in seat number `p` now leaves the room.  

**Example 1:**

```
Input: ["ExamRoom","seat","seat","seat","seat","leave","seat"], [[10],[],[],[],[],[4],[]]
Output: [null,0,9,4,2,null,5]
Explanation:
ExamRoom(10) -> null
seat() -> 0, no one is in the room, then the student sits at seat number 0.
seat() -> 9, the student sits at the last seat number 9.
seat() -> 4, the student sits at the last seat number 4.
seat() -> 2, the student sits at the last seat number 2.
leave(4) -> null
seat() -> 5, the student sits at the last seat number 5.
```

Algorithm:

Maintain a sorted list or treeset for all students.

For leave, it is very clear, we can just remove(p).

As to the seat, for two adjacent students i and j, the closest distance is d =  (j - i) / 2, for the next students, it will be i + d. And for the corner case, we can handle them seperately.