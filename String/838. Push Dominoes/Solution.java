class Solution {
    public String pushDominoes(String dominoes) {
        char[] array = dominoes.toCharArray();
        
        int n = array.length;
        int prevIndex = -1;
        char lastCh = '.';
        
        for (int i = 0; i < n; i++) {
            if (array[i] == 'R') {
                if (lastCh == 'R') {
                    markAsR(array, prevIndex + 1, i);
                }
                lastCh = 'R';
                prevIndex = i;
            }
            else if (array[i] == 'L') {
                if (lastCh == 'R') {
                    int scope = i - prevIndex + 1;
                    int middle = scope / 2;
                    int leftStart = (scope % 2 == 0) ? prevIndex + middle : prevIndex + middle + 1;
                    markAsR(array, prevIndex + 1, prevIndex + middle);
                    markAsL(array, leftStart, i);
                }    
                else {
                    markAsL(array, prevIndex + 1, i);
                }
                prevIndex = i;
                lastCh = 'L';
            }
        }
        
        if (lastCh == 'R') {
            markAsR(array, prevIndex + 1, array.length);
        }
        
        return new String(array);
    }
    
    private void markAsL(char[] array, int start, int end) {
        if (start > end) {
            return;
        }
        for (int i = start; i < end; i++) {
            array[i] = 'L';
        }
    }
    
    private void markAsR(char[] array, int start, int end) {
        if (start > end) {
            return;
        }
        for (int i = start; i < end; i++) {
            array[i] = 'R';
        }
    }
}