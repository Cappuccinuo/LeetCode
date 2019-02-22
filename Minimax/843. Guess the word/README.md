Time spent :  40 min(See hint)

GIVEN: We are given a word list of unique words, each word is 6 letters long, and one word in this list is chosen as **secret**.

You may call `master.guess(word)` to guess a word.  The guessed word should have type `string` and must be from the original list with 6 lowercase letters.

```
Example 1:
Input: secret = "acckzz", wordlist = ["acckzz","ccbazz","eiowzz","abcczz"]

Explanation:

master.guess("aaaaaa") returns -1, because "aaaaaa" is not in wordlist.
master.guess("acckzz") returns 6, because "acckzz" is secret and has all 6 matches.
master.guess("ccbazz") returns 3, because "ccbazz" has 3 matches.
master.guess("eiowzz") returns 2, because "eiowzz" has 2 matches.
master.guess("abcczz") returns 4, because "abcczz" has 4 matches.

We made 5 calls to master.guess and one of them was the secret, so we pass the test case.
```

Algorithm:

For each iteration, we will narrow down the target.

We will have a helper function match that compare how many position two strings are equal.

We traverse the wordlist and compare each word with others, if match(a, b) == 0, then we add the frequency of a with 1. The frequency means how many times this word is totally different with other words.

Why we need do that? Cause we need to figure out what's the worst word we guess, and what's the best word we can guess.

If one word is the word with least difference with other words, then we guess that word.

After that, we get a number k that represent how many position we are right.

Then we traverse the wordlist again, and match this word with every word, if the match is k, then that word might be the target, so we add it to the new list, wordlist will be that list transform to array.