Time spent : 20 min(See hint)

GIVEN: a random list of people standing in a queue. Each person is described by a pair of integers (h, k). h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h.

RETURNS: Reconstruct the queue.

**Example**

```
Input:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

Output:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
```



First we can sort the array. When two people have equal height, we put the one with less number of people in front of him first. If two people have different height, we put the one who is taller first. So in the example, the sorted result is [[7, 0], [7, 1], [6, 1], [5, 0], [5, 2], [4, 4]].

Why we sort like this? We want to insert the people into right position. The last step we do is traverse the people queue, and add the people to a list, the pos is the people number before the person. So for [7, 0], we insert him to index 0. And then when across [5, 0] we put [5, 0] before [7, 0].