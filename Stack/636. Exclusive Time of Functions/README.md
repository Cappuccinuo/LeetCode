Time spent :  15 min(See hint)

GIVEN: running logs of n functions

RETURNS: exclusive time of these functions

Note: A log is a string has this format : `function_id:start_or_end:timestamp`. For example, `"0:start:0"` means function 0 starts from the very beginning of time 0. `"0:end:0"` means function 0 ends to the very end of time 0.

EXAMPLES:

**Example 1:**

```
Input:
n = 2
logs = 
["0:start:0",
 "1:start:2",
 "1:end:5",
 "0:end:6"]
Output:[3, 4]
Explanation:
Function 0 starts at time 0, then it executes 2 units of time and reaches the end of time 1. 
Now function 0 calls function 1, function 1 starts at time 2, executes 4 units of time and end at time 5.
Function 0 is running again at time 6, and also end at the time 6, thus executes 1 unit of time. 
So function 0 totally execute 2 + 1 = 3 units of time, and function 1 totally execute 4 units of time.
```

Algorithm:

Cause the functions are called recursively, we can use stack to solve this.

We push id as the key in stack. And keep record of prev time. Deal with two situation Start and End.