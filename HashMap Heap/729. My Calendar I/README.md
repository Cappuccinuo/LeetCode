Time spent : 20 min(See hint)

------

Implement a `MyCalendar` class to store your events. A new event can be added if adding the event will not cause a double booking.

**Example:**

```
MyCalendar();
MyCalendar.book(10, 20); // returns true
MyCalendar.book(15, 25); // returns false
MyCalendar.book(20, 30); // returns true
Explanation: 
The first event can be booked.  The second can't because time 15 is already booked by another event.
The third event can be booked, as the first event takes every time less than 20, but not including 20.
```



We should maintain our events in sorted order, we can check whether an event could be booked in O(logN) time by binary search. We should also insert the event that can be booked. So we can use TreeMap.

TreeMap.floorKey()    (TreeMap.ceilingKey() opposite)

return the greatest key less than or equal to the given key, or null if no such key.

