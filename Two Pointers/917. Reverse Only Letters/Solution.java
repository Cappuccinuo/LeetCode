class Solution {
    public String reverseOnlyLetters(String S) {
        char[] array = S.toCharArray();
        int len = array.length;
        int i = 0;
        int j = len - 1;
        while (i < j) {
            while (i < j && !Character.isLetter(array[i])) {
                i++;
            }
            while (i < j && !Character.isLetter(array[j])) {
                j--;
            }
            if (i < j) {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            i++;
            j--;
        }
        return new String(array);
    }
}