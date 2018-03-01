Time spent : 20 min(See hint)

GIVEN: N gas station, where the amount of gas at station i is gas[i], and cost[i] of gas to travel from station i to its next station i + 1.

RETURNS: the stating gas station's index if you can travel around the circuit once, otherwise return -1.



1. If the toal gas is larger than total cost, then there is a solution.
2. We can use total to record the gas and cost difference. Once the sum of k stations is negative, we add the sum to total, and reset sum to 0, start point is next station. At last, we add the sum to total, if total is negative, return -1, otherwise return start.

