Time spent : 10min(See hint)

GIVEN: Given a binary tree

RETURNS: return all duplicate subtrees

EXAMPLES:

```
        1
       / \
      2   3
     /   / \
    4   2   4
       /
      4
```

The following are two duplicate subtrees:

```
      2
     /
    4
```

and

```
    4
```

Algorithm:

Use hashmap to store serialized binary tree string.