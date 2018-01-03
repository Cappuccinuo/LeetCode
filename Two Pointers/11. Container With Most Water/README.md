Time spent : 5 min(See hint)

GIVEN: n non-negative integer a1, a2..an

RETURNS: max area formed by (i, ai) and (i,0)



Use two pointers, one from head, one from tail.

Cause the area formed between the lines will always be limited by the height of the shorter line. At every step, we find out the area formed between two lines, update maxarea, and move the pointer pointing to the shorter line towards the other end by one step.