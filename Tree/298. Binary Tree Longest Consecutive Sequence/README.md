Time spent : 15min (see hint)

GIVEN: a binary tree

RETURNS: the length of the longest consecutive sequence path



Use DFS. Use a global variable to record max length. In the DFS procedure, we need three parameters, current treenode, its parent, and current length. If the parent is not null and current value equals parent's val plus one, then the length++, otherwise reset to 1. maxLength should be the maximum between maxLength and current length. Then we conduct DFS on current's left and right.