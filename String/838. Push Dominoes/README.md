Time spent : 20 min(See hint)

GIVEN: a String representing the intial state.`S[i] = 'L'`, if the i-th domino has been pushed to the left; `S[i] = 'R'`, if the i-th domino has been pushed to the right; `S[i] = '.'`, if the `i`-th domino has not been pushed.

RETURNS: the final state

**Example 1:**

```
Input: ".L.R...LR..L.."
Output: "LL.RR.LLRRLL.."
```

**Example 2:**

```
Input: "RR.L"
Output: "RR.L"
Explanation: The first domino expends no additional force on the second domino.DESIGN STRATEGY: 
```



1. When the first pushed domino card is 'L', then the dominoes from 0 to that 'L' will fall down. e.g. "....L...." will become "LLLLL...."
2. When the last pushed domino card is 'R', then the dominoes from that 'R' will fall down. e.g. "....R...." will become "....RRRRR"
3. The dominoes between "LR" depends on the number of cards between them. Odd: leave the card in the middle still.