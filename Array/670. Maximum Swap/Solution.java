class Solution {
    public int maximumSwap(int num) {
        int[] last = new int[10];
        String numStr = String.valueOf(num);
        char[] array = numStr.toCharArray();
        int i;
        for (i = 0; i < numStr.length(); i++) {
            last[array[i] - '0'] = i;
        }
        int digit;
        for (i = 0; i < numStr.length(); i++) {
            for (digit = 9; digit > (array[i] - '0'); digit--) {
                if (last[digit] > i) {
                    char temp = array[i];
                    array[i] = array[last[digit]];
                    array[last[digit]] = temp;
                    return Integer.parseInt(new String(array));
                }
            }
        }
        return num;
    }
}