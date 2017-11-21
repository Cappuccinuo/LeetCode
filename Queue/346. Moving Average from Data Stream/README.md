Time spent : 15 min(Self)

Solution : Queue

GIVEN: a stream of integers and a window size

RETURNS: the moving average of all integers in the sliding window

EXAMPLES:

```
MovingAverage m = new MovingAverage(3);
m.next(1) = 1
m.next(10) = (1 + 10) / 2
m.next(3) = (1 + 10 + 3) / 3
m.next(5) = (10 + 3 + 5) / 3
```

DESIGN STRATEGY: Queue



1. Queue<Integer> q = new LinkedList()

2. If q.size() != window size, no need to remove the peek one

3. Otherwise remove the peek one, minus it from sum and add the new val
