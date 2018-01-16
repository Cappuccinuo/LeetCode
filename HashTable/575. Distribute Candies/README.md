Time spent : 10 min(self)

GIVEN: a integer array with even length

RETURNS: maximum number of different number one can get(divided by two people)

EXAMPLES:

```
Input: candies = [1,1,2,2,3,3]
Output: 3
Explanation:
There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too. 
The sister has three different kinds of candies.  
```

```
Input: candies = [1,1,2,3]
Output: 2
Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1]. 
The sister has two different kinds of candies, the brother has only one kind of candies.
```



1. First we can use hashset. Store all candy. If candies.length / 2 < set.size(), that means we can just get candies.length / 2 category. Otherwise, we can get set.size() category.

2. Or we can sort the array first, and control the count < candies.length / 2, count the different numbers.

      ​

      ​