Time spent : 75 min(self)

Solution : HashTable	

GIVEN: a String licensePlate, a word dictionary words

RETURNS:  the minimum length word from a given dictionary `words`, which has all the letters from the string `licensePlate`

EXAMPLES:

```
Input: licensePlate = "1s3 PSt", words = ["step", "steps", "stripe", "stepple"]
Output: "steps"
Explanation: The smallest length word that contains the letters "S", "P", "S", and "T".
Note that the answer is not "step", because the letter "s" must occur in the word twice.
Also note that we ignored case for the purposes of comparing whether a letter exists in the word.
```

```
Input: licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
Output: "pest"
Explanation: There are 3 smallest length words that contains the letters "s".
We return the one that occurred first.
```



1. Put the letter in licensePlate to a hashmap, remember to normalize the uppercase and lowercase

2. Sort the words based on length, smaller one has smaller index.

3. Put every word in hashmap, same method as licensePlate.

4. Make a flag isComplete, so if the loop break, we won't return the incomplete word

               boolean isComplete = true;
               for (Integer i : licensePlateMap.keySet()) {
                   if (wordMap.get(i) == null || wordMap.get(i) < licensePlateMap.get(i)) {
                       isComplete = false;
                       break;
                   }
               }
               if (isComplete) {
                   return word;
               }