Time spent : 10min (see a little hint)

Solution : String -> Boolean	

GIVEN: two string s an t

RETURNS: true if they are both one edit distance apart



Go through the two string, if one character is different, there are three cases:

1. Two String length equal. Then we just need to compare the rest of two string.
2. One is longer, then we just need to compare the rest of the longer one and the other one.

The last case is like "abc" and "abcd", that one is just longer than the other by 1.