Time spent : 10 min(Self)

GIVEN: a picture that represented by a 2D char array consisting of 'B' and 'W', which means black and white pixels respectively.

RETURNS: The number of black lonely pixels.

Note: A black lonely pixel is character 'B' that located at a specific position where the same row and same column don't have any other black pixels.



**Example:**

```
Input: 
[['W', 'W', 'B'],
 ['W', 'B', 'W'],
 ['B', 'W', 'W']]

Output: 3
Explanation: All the three 'B's are black lonely pixels.
```



We need two array to record the number of 'B' at each row and col.

And for each 'B', we compare row[i] and col[j].