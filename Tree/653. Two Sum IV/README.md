Time spent : 15 min

Solution1 : DFS

Solution2 : BFS	

Solution3 : Use inorder of BST

GIVEN: a TreeNode and a target

RETURNS: true if there exist two elements in the BST such that their sum is equal to the given target.

EXAMPLES:

Input: 

```
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9
```

Output: True

Input:

```
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28
```

Output: False



Solution 1:

The simplest solution will be to traverse over the whole tree and consider every possible pair of nodes to determine if they can form the required sum k. But, we can improve the process if we look at a little catch here.

If the sum of two elements x + y equals k, and we already know that x exists in the given tree, we only need to check if an element y exists in the given tree, such that y = k - x. Based on this simple catch, we can traverse the tree in both the directions(left child and right child) at every step. We keep a track of the elements which have been found so far during the tree traversal, by putting them into a setset.

For every current node with a value of p, we check if k-p already exists in the array. If so, we can conclude that the sum k can be formed by using the two elements from the given tree. Otherwise, we put this value p into the setset.

If even after the whole tree's traversal, no such element pp can be found, the sum k can't be formed by using any two elements.





Solution 2:

**Algorithm**

In this approach, the idea of using the setset is the same as in the last approach. But, we can carry on the traversal in a Breadth First Search manner, which is a very common traversal method used in Trees. The way BFS is used can be summarized as given below. We start by putting the root node into a queuequeue. We also maintain a setset similar to the last approach. Then, at every step, we do as follows:

1. Remove an element, p, from the front of the queuequeue.
2. Check if the element k-p already exists in the setset. If so, return True.
3. Otherwise, add this element, p to the setset. Further, add the right and the left child nodes of the current node to the back of the queuequeue.
4. Continue steps 1. to 3. till the queuequeue becomes empty.
5. Return false if the queuequeue becomes empty.

By following this process, we traverse the tree on a level by level basis.



Solution 3:

**Algorithm**

In this approach, we make use of the fact that the given tree is a Binary Search Tree. Now, we know that the inorder traversal of a BST gives the nodes in ascending order. Thus, we do the inorder traversal of the given tree and put the results in a listlist which contains the nodes sorted in ascending order.

Once this is done, we make use of two pointers l and r pointing to the beginning and the end of the sorted listlist. Then, we do as follows:

1. Check if the sum of the elements pointed by l and r is equal to the required sum k. If so, return a True immediately.
2. Otherwise, if the sum of the current two elements is lesser than the required sum k, update ll to point to the next element. This is done, because, we need to increase the sum of the current elements, which can only be done by increasing the smaller number.
3. Otherwise, if the sum of the current two elements is larger than the required sum kk, update rr to point to the previous element. This is done, because, we need to decrease the sum of the current elements, which can only be done by reducing the larger number.
4. Continue steps 1. to 3. till the left pointer l crosses the right pointer r.
5. If the two pointers cross each other, return a False value.

Note that we need not increase the larger number or reduce the smaller number in any case. This happens because, in case, a number larger than the current list[r]list[r] is needed to form the required sum kk, the right pointer could not have been reduced in the first place. The similar argument holds true for not reducing the smaller number as well.