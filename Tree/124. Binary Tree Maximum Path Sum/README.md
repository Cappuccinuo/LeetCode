Time spent : 15 min (See hint)

GIVEN: a binary tree

RETURN: maximum path sum

EXAMPLES:

Input: 

```
       1
      / \
     2   3
```

Output: 6

![Tree](https://github.com/Cappuccinuo/LeetCode/blob/master/Tree/124.%20Binary%20Tree%20Maximum%20Path%20Sum/Tree.png?raw=true)

For example, in this scenario, the path is 10-2-1-2-90, max is 105.

![](https://github.com/Cappuccinuo/LeetCode/blob/master/Tree/124.%20Binary%20Tree%20Maximum%20Path%20Sum/Tree2.png?raw=true)

In this scenerio, the path is 10-2-10.

The max value equals to

Math.max(maxPathSum of left tree, maxPathSum of right tree, left one path + right one path + root.val)