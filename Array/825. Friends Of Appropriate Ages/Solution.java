class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        for (int age : ages) {
            count[age]++;
        }
        
        int ans = 0;
        
        for (int ageA = 1; ageA <= 120; ageA++) {
            int countA = count[ageA];
            for (int ageB = 1; ageB <= 120; ageB++) {
                int countB = count[ageB];
                if (ageB <= 0.5 * ageA + 7) {
                    continue;
                }
                if (ageB > ageA) {
                    continue;
                }
                if (ageB > 100 && ageA < 100) {
                    continue;
                }
                ans += countA * countB;
                if (ageA == ageB) {
                    ans -= countA;
                }
            }
        }
        
        return ans;
    }
}