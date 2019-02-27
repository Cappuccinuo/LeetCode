/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        int candidate = 0;
        for (int person = 1; person < n; person++) {
            if (knows(candidate, person)) {
                candidate = person;
            }
        }
        
        for (int person = 0; person < n; person++) {
            if (person != candidate) {
                if (knows(candidate, person) || !knows(person, candidate)) {
                    return -1;
                }
            }
        }
        
        return candidate;
    }
}