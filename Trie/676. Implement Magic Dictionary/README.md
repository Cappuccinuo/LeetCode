Time spent : 60 min(See a little hint)

Implement a magic directory with `buildDict`, and `search` methods.

For the method `buildDict`, you'll be given a list of non-repetitive words to build a dictionary.

For the method `search`, you'll be given a word, and judge whether if you modify **exactly** one character into **another** character in this word, the modified word is in the dictionary you just built.

**Example 1:**

```
Input: buildDict(["hello", "leetcode"]), Output: Null
Input: search("hello"), Output: False
Input: search("hhllo"), Output: True
Input: search("hell"), Output: False
Input: search("leetcoded"), Output: False
```



1. The key problem is how to count just 1 modification.

2. In the search part, we go through all the 26 letters and TrieNode. Jump the letter we have, and check if rest of word is in the dictionary. 

       public boolean search(String word) {
           TrieNode current = root;
           int k = 0;
           while (current != null) {
               if (k == word.length()) {
                   return false;
               }
               char ch = word.charAt(k);
               int ascii = ch - 'a';
               for (int i = 0; i < 26; i++) {
                   if (i == ascii) {
                       continue;
                   }
                   if (current.children.get((char)(i + 97)) != null && searchUtil(current.children.get((char)(i + 97)), word, k + 1)) {
                       return true;
                   }
               }
               k++;
               current = current.children.get(ch);
           }
           return false;
       }

