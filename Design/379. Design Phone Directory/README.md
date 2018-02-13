Time spent : 10min(see hint for linkedhashset)

Design a Phone Directory which supports the following operations:

1. `get`: Provide a number which is not assigned to anyone.
2. `check`: Check if a number is available or not.
3. `release`: Recycle or release a number.

EXAMPLES:

```
// Init a phone directory containing a total of 3 numbers: 0, 1, and 2.
PhoneDirectory directory = new PhoneDirectory(3);

// It can return any available phone number. Here we assume it returns 0.
directory.get();

// Assume it returns 1.
directory.get();

// The number 2 is available, so return true.
directory.check(2);

// It returns 2, the only number that is left.
directory.get();

// The number 2 is no longer available, so return false.
directory.check(2);

// Release number 2 back to the pool.
directory.release(2);

// Number 2 is available again, return true.
directory.check(2);
```



1. We can use a set to contain all the numbers, while we need to keep the number in order, so we use linkedHashSet.
2. get is use iterator, but pay attention to iter.next(), it is an object, so we need to transfer it to (int).
3. check is just call set.contains?
4. release is to add the number again.
