Time spent : 20min(self)

GIVEN: a pattern and a string str

RETURNS:  true iff str follows the same pattern

**Examples:**

1. pattern = `"abba"`, str = `"dog cat cat dog"` should return true.
2. pattern = `"abba"`, str = `"dog cat cat fish"` should return false.
3. pattern = `"aaaa"`, str = `"dog cat cat dog"` should return false.
4. pattern = `"abba"`, str = `"dog dog dog dog"` should return false.



1. Use hashmap to store the map. Key is the character in pattern, value is the corresponding word in str.
2. When the map has character in s, but current character in t is not equal to the value in map. Return false
3. When the map has no charcter in s, but has current character in t in the map values. Return false.
4. Remember to use equals to compare two string.