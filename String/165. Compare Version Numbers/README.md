Time spent : 10 min(See hint)

GIVEN: two version numbers version1 and version2

RETURNS: If *version1* > *version2* return 1, if *version1* < *version2* return -1, otherwise return 0.

EXAMPLES:

1.1 < 1.2 < 2.1



1. Split the string to a string array. 
2. Let the len be the max of the two. Traverse the two versions, if the i exceed, make the version number now 0. Return first.compareTo(second)