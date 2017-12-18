Time spent : 5 min(self)

GIVEN: the steps of a stair case

RETURNS: distinct ways number that can climb to the top

Note: 1 or 2 steps a time



fibonacci number   f(n) = f(n - 1) + f(n - 2)

1: 1 way

2: 2 ways(2, 1 + 1)

3: 3 ways(1 + 1 + 1, 1 + 2, 2 + 1)

4: 5 ways(1 + 1 + 1 + 1, 1 + 2 + 1, 2 + 1 + 1, 1 + 1 + 2, 2 + 2)

​                  |          from 3rd step                  |   from 2nd step|



The reason is, we can get to 4th step from 2nd step + 2, or 3rd step + 1



