class Solution {
    public int subarrayBitwiseORs(int[] A) {
        Set<Integer> cur = new HashSet();
        Set<Integer> result = new HashSet();
        
        for (int x : A) {
            Set<Integer> temp = new HashSet();
            for (int y : cur) {
                temp.add(x | y);
            }
            temp.add(x);
            cur = temp;
            result.addAll(cur);
        }
        
        return result.size();
    }
}