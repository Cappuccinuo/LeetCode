Time spent : 10 min(See hint)

GIVEN: two linked list

RETURNS: the intersection node



1. calculate two lists' steps. StepA, StepB.
2. While step A > step B, move A list node to next. Same to B list.
3. While the remaining length of two lists are the same, move two lists together, when two nodes equals, that one is the intersection node.