class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int len = queries.length;
        int[] num = new int[words.length];
        int index = 0;
        for (String word : words) {
            num[index++] = getFValue(word);
        }
        Arrays.sort(num);
        index = 0;
        int[] result = new int[len];
        for (String query : queries) {
            int val = getFValue(query);
            result[index++] = num.length - getNumLargerThanVal(val, num);
        }
        return result;
    }
    
    private int getNumLargerThanVal(int value, int[] array) {
        int len = array.length;
        int start = 0;
        int end = len - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] > value) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        if (array[end] > value) {
            return end;
        }
        if (array[start] > value) {
            return start;
        }
        
        return len;
    }
    
    private int getFValue(String word) {
        char c = 'a';
        for (c = 'a'; c <= 'z'; c++) {
            if (word.indexOf(c) != -1) {
                break;
            }
        }
        int count = 0;
        for (char ch : word.toCharArray()) {
            count += (ch == c) ? 1 : 0;
        }
        return count;
    }
}