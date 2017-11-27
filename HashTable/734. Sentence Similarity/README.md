Time spent : 15 min

Solution : HashSet	

GIVEN: two sentences words1, words2 and a list of similar word pairs

RETURNS: true iff two sentences are similar

EXAMPLES:

For example, "great acting skills" and "fine drama talent" are similar, if the similar word pairs are `pairs = [["great", "fine"], ["acting","drama"], ["skills","talent"]]`

Also, a word is always similar with itself. For example, the sentences `words1 = ["great"], words2 = ["great"], pairs = []` are similar, even though there are no specified similar word pairs.

DESIGN STRATEGY: HashSet



1. Use "#" to connect the pair in pairs
2. Compare words1 and words2 with the pairs in hashset
