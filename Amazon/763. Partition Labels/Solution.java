// 2018.4.11
class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new LinkedList<>();
        if (S == null || S.length() == 0) {
            return result;
        }
        int[] lastPos = new int[26];
        char[] letters = S.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            lastPos[letters[i] - 'a'] = i;
        }
        
        int maxRight = 0;
        int pivot = 0;
        for (int i = 0; i < letters.length; i++) {
            maxRight = Math.max(maxRight, lastPos[letters[i] - 'a']);
            if (i == maxRight) {
                int size = i - pivot + 1;
                result.add(size);
                pivot = i + 1;
            }
        }
        return result;
    }
}