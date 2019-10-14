Time spent :  5 min(Self)

GIVEN: Given a string `text`, you want to use the characters of `text` to form as many instances of the word **"balloon"** as possible. You can use each character in `text` **at most once**.

RETURNS: the maximum number of instances that can be formed.

EXAMPLES:

**Example 1:**

**![img](https://assets.leetcode.com/uploads/2019/09/05/1536_ex1_upd.JPG)**

```
Input: text = "nlaebolko"
Output: 1
```

**Example 2:**

**![img](https://assets.leetcode.com/uploads/2019/09/05/1536_ex2_upd.JPG)**

```
Input: text = "loonbalxballpoon"
Output: 2
```

**Example 3:**

```
Input: text = "leetcode"
Output: 0
```

Algorithm:

Use an array to count each letter's time.