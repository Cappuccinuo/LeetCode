class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        TreeSet<Integer> set = new TreeSet();
        int sum = -1;
        for (int num : A) {
            Integer l = set.lower(K - num);
            if (l != null) {
                sum = Math.max(sum, l + num);
            }
            set.add(num);
        }
        return sum;
    }
}