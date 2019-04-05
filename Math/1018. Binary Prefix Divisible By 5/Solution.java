class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new LinkedList<>();
        int current = 0;
        for (int num : A) {
            current = (current << 1 | num) % 5;
            list.add(current == 0);
        }
        return list;
    }
}