Time spent : 5 min(self)

EXAMPLES:

```
Input: 
Tree 1                  Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
Output: 
Merged tree:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7
```



Recursion

1. If t1 is null, get t2's node, same to t2.
2. t2.val += t1.val, use t2 as the final treenode.
3. t2's left and right use the recursion.

Iteration

1. Use stack. Push t1 and t2 as a TreeNode[] array.