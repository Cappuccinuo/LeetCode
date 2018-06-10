Time spent : 50 min(Self)

Given: a string of lowercase letters, and an integer array shifts

Returns: the final string after all such shifts to S be applied

Call the *shift* of a letter, the next letter in the alphabet, (wrapping around so that `'z'` becomes `'a'`). 

For example, `shift('a') = 'b'`, `shift('t') = 'u'`, and `shift('z') = 'a'`.

Now for each `shifts[i] = x`, we want to shift the first `i+1` letters of `S`, `x` times.



**Example 1:**

```
Input: S = "abc", shifts = [3,5,9]
Output: "rpl"
Explanation: 
We start with "abc".
After shifting the first 1 letters of S by 3, we have "dbc".
After shifting the first 2 letters of S by 5, we have "igc".
After shifting the first 3 letters of S by 9, we have "rpl", the answer.
```



The trick here is to get the actual shifts array of the string. Notice that for First letter, we shift shifts[0] + shifts[1] + shifts[2] + ..., for second letter, we shift shifts[1] + shifts[2] + ...

And another thing should pay attention to is the next letter of 'z' is 'a'. 