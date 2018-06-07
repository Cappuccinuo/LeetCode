Time spent : 20 min(See hint)

------

Implement a `MyCalendar` class to store your events. A new event can be added if adding the event will not cause a triple booking.

**Example:**

```
MyCalendar();
MyCalendar.book(10, 20); // returns true
MyCalendar.book(50, 60); // returns true
MyCalendar.book(10, 40); // returns true
MyCalendar.book(5, 15); // returns false
MyCalendar.book(5, 10); // returns true
MyCalendar.book(25, 55); // returns true
Explanation: 
The first two events can be booked.  The third event can be double booked.
The fourth event (5, 15) can't be booked, because it would result in a triple booking.
The fifth event (5, 10) can be booked, as it does not use time 10 which is already double booked.
The sixth event (25, 55) can be booked, as the time in [25, 40) will be double booked with the third event;
the time [40, 50) will be single booked, and the time [50, 55) will be double booked with the second event.
```



When booking a new event `[start, end)`, count `delta[start]++` and `delta[end]--`. When processing the values of `delta` in sorted order of their keys, the running sum `active` is the number of events open at that time. If the sum is 3 or more, that time is (at least) triple booked.

