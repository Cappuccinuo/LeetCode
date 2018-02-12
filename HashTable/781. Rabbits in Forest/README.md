Time spent : 60min(self)

Solution : HashTable and count

GIVEN: The array that tells how many other rabbits have the same color as them

RETURNS:  minimum number of rabbits that could be in the forest



Test Case:

[0,0,1,1,1]

[0,2,0,2,1]

[2,1,2,2,2,2,2,2,1,1]

[0,1,0,2,0,1,0,2,1,1]

[1,0,1,0,0]

We can find that 1, 1 can be two rabbits, 2,2,2 can be three rabbits, so map.get(i)/(i + 1) * (i+1) is the minimum rabbits. While 2,2,2,2 can be 6 rabbits, so when map.get(i) % (i + 1) != 0, result will add i + 1.