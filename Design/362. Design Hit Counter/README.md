Time spent :  10 min(See hint)

Design a hit counter which counts the number of hits received in the past 5 minutes.

**Example:**

```
HitCounter counter = new HitCounter();

// hit at timestamp 1.
counter.hit(1);

// hit at timestamp 2.
counter.hit(2);

// hit at timestamp 3.
counter.hit(3);

// get hits at timestamp 4, should return 3.
counter.getHits(4);

// hit at timestamp 300.
counter.hit(300);

// get hits at timestamp 300, should return 4.
counter.getHits(300);

// get hits at timestamp 301, should return 3.
counter.getHits(301); 
```

Algorithm:

We just need to keep 300 records, cause 5 minutes = 300 seconds.

timestamp 301 and timestamp 1, is actually located at same index at the record bucket, cause if we hit 301, then timestamp 1 is invalid.