class Solution {
    public int totalFruit(int[] tree) {
        int start = 0;
        int end = 0;
        int len = tree.length;
        int result = 0;
        int count = 0;
        int[] map = new int[len];
        while (end < len) {
            int type = tree[end];
            end++;
            map[type]++;
            if (map[type] == 1) {
                count++;
            }
            
            while (count > 2) {
                int temp = tree[start];
                map[temp]--;
                start++;
                if (map[temp] == 0) {
                    count--;
                }
            }
            
            result = Math.max(result, end - start);
        }
        
        return result;
    }
}