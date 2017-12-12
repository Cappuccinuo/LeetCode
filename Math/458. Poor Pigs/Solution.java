class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int n = minutesToTest / minutesToDie;
        double result = Math.log((double)buckets) / Math.log((double)(n + 1));
        return (int)Math.ceil(result);
    }
}