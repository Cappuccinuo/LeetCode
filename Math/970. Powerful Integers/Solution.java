class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet();
        for (int i = 0; i < 18 && Math.pow(x, i) <= bound; i++) {
            for (int j = 0; j < 18 && Math.pow(y, j) <= bound; j++) {
                if (Math.pow(x, i) + Math.pow(y, j) <= bound) {
                    set.add((int)(Math.pow(x, i) + Math.pow(y, j)));
                }
            }
        }
        return new ArrayList(set);
    }
}