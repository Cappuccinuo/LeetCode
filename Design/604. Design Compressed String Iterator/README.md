Time spent :  20 min(self)

GIVEN: compressed string

DESIGN: next() and hasNext()

**Example:**

```
StringIterator iterator = new StringIterator("L1e2t1C1o1d1e1");

iterator.next(); // return 'L'
iterator.next(); // return 'e'
iterator.next(); // return 'e'
iterator.next(); // return 't'
iterator.next(); // return 'C'
iterator.next(); // return 'o'
iterator.next(); // return 'd'
iterator.hasNext(); // return true
iterator.next(); // return 'e'
iterator.hasNext(); // return false
iterator.next(); // return ' '
```

Algorithm:

Use a queue to store a letterPair consists of current character and its frequency. In next, if queue not empty return the peek, at the mean time substract 1 to that peek's frequency.