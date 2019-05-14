Time spent :  5 min(See hint)

GIVEN: There are `2N` people a company is planning to interview. The cost of flying the `i`-th person to city `A` is `costs[i][0]`, and the cost of flying the `i`-th person to city `B` is `costs[i][1]`.

RETURNS: Return the minimum cost to fly every person to a city such that exactly `N` people arrive in each city.

EXAMPLES:

```
Input: [[10,20],[30,200],[400,50],[30,20]]
Output: 110
Explanation: 
The first person goes to city A for a cost of 10.
The second person goes to city A for a cost of 30.
The third person goes to city B for a cost of 50.
The fourth person goes to city B for a cost of 20.

The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
```

Algorithm:

For each person, the company should at least send him/her to A/B. The money company lost can be view as price_A - prices_B, which can be + or -.

By sorting the costs array by the lost money, we can make the first half to one city, and the rest to another city, in this way, the cost would be minimum.