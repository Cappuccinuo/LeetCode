Time spent :  10 min(See hint)

GIVEN: A big sorted array with positive integers sorted by ascending order

Note: The array is so big so that you can not get the length of the whole array directly, and you can only access the kth number by `ArrayReader.get(k)`

RETURNS:  the first index of a target number

**Example 1:**

```java
Given [1, 3, 6, 9, 21, ...], and target = 3, return 1.

Given [1, 3, 6, 9, 21, ...], and target = 4, return -1.
```

Algorithm:

The hard part of the problem is that we don't know the length of the array. So we can perform a reverse binary search to find the closest scope of where target locate.

```java
while (reader.get(index) < target) {
    index = index * 2;
}
```



