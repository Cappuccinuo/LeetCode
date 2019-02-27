Time spent : 60 min during contest

Solution : Stack

GIVEN: a list of daily temperatures

RETURNS: a list that, for each day in the input, tells you how many days you would have to wait until a warmer temperature.

EXAMPLES:

```
Input: 
temperatures = [73, 74, 75, 71, 69, 72, 76, 73]
Output:
[1, 1, 4, 2, 1, 1, 0, 0]
```

DESIGN STRATEGY: Stack



First tried hashmap, but run out of time.

Then we use stack. Push the index of number in the stack. While(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])

then result[stack.pop()] = i - temp.

Then rest of number in stack all have result[stack.pop()] = 0

