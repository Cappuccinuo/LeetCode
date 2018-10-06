Time spent :  30 min(Self)

GIVEN: A list of accounts, each element accounts[i] is a list of strings. Where accounts\[i][0] is a name, and the rest of the elements are emails representing emails of the account. 

RETURNS: After merging the accounts, return the accounts in the following format: the first element of each account is the name, and the rest of the elements are emails **in sorted order**. The accounts themselves can be returned in any order.

Note: Two accounts definitely belong to the same person if there is some email that is common to both accounts. Note that even if two accounts have the same name, they may belong to different people as people could have the same name.

EXAMPLES:

```
Input: 
accounts = [["John", "johnsmith@mail.com", "john00@mail.com"], ["John", "johnnybravo@mail.com"], ["John", "johnsmith@mail.com", "john_newyork@mail.com"], ["Mary", "mary@mail.com"]]
Output: [["John", 'john00@mail.com', 'john_newyork@mail.com', 'johnsmith@mail.com'],  ["John", "johnnybravo@mail.com"], ["Mary", "mary@mail.com"]]
```

Algorithm:

The problem can be abstracted to a graph problem, where we find the connected components of a graph, so we can use Disjoint Set Union(DSU) structure.

For UnionFind, we have an int array father represents the father of index i. Initially the size of union find is accounts' size. In find method, we recursivelly find the root of current id, as the root's father must be the root itself. In union method, we use find method to get id1 and id2 's root, if they are not equal, we make the father of id1 be id2. In our problem, account_id is the label. 

As to our problem, we want to union the id with same email, so we can get a structure like for email a, we can find a list of ids that share a. It's easy to think we can use hashmap, key is email(string), value is ids(list<Integer>). After we get the map, we union the numbers in every list corresponding to every string.

As we union all the "user", we can find a set of email for each user. That's also a map, key is integer, value is Set<String>. Note that during traverse the account_id, we use uf.find(account_id) to get the actual user, and add email to the set of account_id. 

So the flow is Map<String, List<Integer>> -> Union -> Map<Integer, Set<String>> -> List<List<String>>