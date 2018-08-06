class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int N = people.length;
        Arrays.sort(people);
        int ans = 0;
        int start = 0;
        int end = N - 1;
        
        while (start <= end) {
            ans++;
            if (people[start] + people[end] <= limit) {
                start++;
            }
            end--;
        }
        
        return ans;
    }
}