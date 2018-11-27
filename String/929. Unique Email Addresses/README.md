Time spent :  5 min(Self)

GIVEN: Email addresses list

RETURNS: How many different addresses actually receive mails

EXAMPLES:

```
Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
```

Algorithm:

Using hashset to deal with duplicates.

Discuss '.' and '+' before '@' and append string after '@'.