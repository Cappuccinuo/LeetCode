Time spent : 25 min(Self)

GIVEN: A transaction is *possibly invalid* if:

- the amount exceeds $1000, or;
- if it occurs within (and including) 60 minutes of another transaction with the same name in a different city.

Given a list of `transactions` each consists of comma separated values representing the name, time (in minutes), amount, and city of the transaction.

RETURNS: a list of transactions that are possibly invalid

EXAMPLES:

**Example 1:**

```
Input: transactions = ["alice,20,800,mtv","alice,50,100,beijing"]
Output: ["alice,20,800,mtv","alice,50,100,beijing"]
Explanation: The first transaction is invalid because the second transaction occurs within a difference of 60 minutes, have the same name and is in a different city. Similarly the second one is invalid too.
```

**Example 2:**

```
Input: transactions = ["alice,20,800,mtv","alice,50,1200,mtv"]
Output: ["alice,50,1200,mtv"]
```

**Example 3:**

```
Input: transactions = ["alice,20,800,mtv","bob,50,1200,mtv"]
Output: ["bob,50,1200,mtv"]
```

Algorithm:

Using brute force way. Put the transaction with same name in hashmap. 