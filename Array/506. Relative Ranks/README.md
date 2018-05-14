Time spent : 20 min(Self)

GIVEN: N athletes

RETURNS: relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

**Example 1:**

```
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.
```



Use another array to sort the array in reverse order. Then put all number and the relative rank in the hashmap. At last, we use string[] result array to store all the relative ranks.