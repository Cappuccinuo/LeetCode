Time spent :  15 min(See hint)

GIVEN: an array A of Strings

RETURNS: the number of groups of special-equivalent strings from A

Note: A *move* consists of choosing two indices `i` and `j` with `i % 2 == j % 2`, and swapping `S[i]` with `S[j]`.

Now, a *group of special-equivalent strings from A* is a non-empty subset S of `A` such that any string not in S is not special-equivalent with any string in S.

EXAMPLES:

Algorithm:

Using hashset. For every string in A, we generate its corresponding odd even string, add it to the set.