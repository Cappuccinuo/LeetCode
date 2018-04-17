Time spent : 15 min(see hint)

GIVEN: a nums array and a target value k

RETURNS: the maximum length of a subarray that sums to k



Use a hashmap to record the current sum from beginning so far. 

Everytime we compare not only the current sum, but also to see if there is sum that equals to sum - k, that means from the position of sum - k to current index, the sum is k.

