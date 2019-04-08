class Solution {
    public int wordsTyping(String[] sentence, int rows, int cols) {
        int len = sentence.length;
        int i;
        int time;
        int current;
        int wordLen;
        int[] nextIndex = new int[len];
        int[] times = new int[len];
        for (i = 0; i < len; i++) {
            time = 0;
            wordLen = 0;
            current = i;
            while (wordLen + sentence[current].length() <= cols) {
                wordLen += sentence[current].length() + 1;
                current++;
                if (current == len) {
                    current = 0;
                    time++;
                }
            }
            nextIndex[i] = current;
            times[i] = time;
        }
        int res = 0;
        current = 0;
        for (i = 0; i < rows; i++) {
            res += times[current];
            current = nextIndex[current];
        }
        return res;
    }
}