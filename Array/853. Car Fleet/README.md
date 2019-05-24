Time spent :  20 min(Self)

GIVEN: `N` cars are going to the same destination along a one lane road.  The destination is `target` miles away.

Each car `i` has a constant speed `speed[i]` (in miles per hour), and initial position `position[i]` miles towards the target along the road.

RETURNS: How many car fleets will arrive at the destination?

**Example 1:**

```
Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
Output: 3
Explanation:
The cars starting at 10 and 8 become a fleet, meeting each other at 12.
The car starting at 0 doesn't catch up to any other car, so it is a fleet by itself.
The cars starting at 5 and 3 become a fleet, meeting each other at 6.
Note that no other cars meet these fleets before the destination, so the answer is 3.
```

Algorithm:

The trick here is to work from backward. If the current time is larger than previous time, then it is a new fleet. 

One way to do this is sort the cars by their position ascending(same then speed descending), then using a stack to store the time need to take for cars from back. If time is larger then stack's top, then increase the fleet, push the time.

Without sorting the array first, we can using a treemap. The important point now is what we store as the key and value. The value is easy, that is the time. The key is the sorting field of treemap, so based on previous method, we use position as the key. To deal with the car from back, we use negative position as the key. At last, we traverse the values of the map, and use the same compare method as previous.