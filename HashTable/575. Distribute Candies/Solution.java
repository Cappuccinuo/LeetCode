class Solution {
    public int distributeCandies(int[] candies) {
        int len = candies.length;
        int dist = len / 2;
        Set<Integer> set = new HashSet();
        for (int candy : candies) {
            set.add(candy);
        }
        return dist <= set.size() ? dist : set.size();
    }
}

class Solution {
    public int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int count = 1;
        for (int i = 1; i < candies.length  && count < candies.length / 2; i++) {
            if (candies[i] > candies[i - 1]) {
                count++;
            }
        } 
        return count;
    }
}