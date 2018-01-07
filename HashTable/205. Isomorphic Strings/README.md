Time spent : 10min(self)

GIVEN: two Strings s and t

RETURNS:  true iff they are isomorphic

Note: two strings are isomorphic if the characters in s can be replaced to get t



1. Use hashmap to store the map. Key is the character in s, value is the corresponding character in t.
2. When the map has character in s, but current character in t is not equal to the value in map. Return false
3. When the map has no charcter in s, but has current character in t in the map values. Return false.