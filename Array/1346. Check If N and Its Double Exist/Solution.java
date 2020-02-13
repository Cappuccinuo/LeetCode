class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Double> set = new HashSet();
        for (int num : arr) {
            double newNum = (double)num;
            if (set.contains(newNum * 2) || set.contains(newNum / 2)) {
                return true;
            }
            set.add(newNum);
        }
        return false;
    }
}