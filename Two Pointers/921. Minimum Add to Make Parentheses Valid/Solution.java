class Solution {
    public int minAddToMakeValid(String S) {
        int left = 0;
        int right = 0;
        char[] array = S.toCharArray();
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(') {
                left++;
                result += "(";
            }
            else if (left > right && array[i] == ')') {
                right++;
                result += ')';
            }
        }
        array = result.toCharArray();
        result = "";
        left = 0;
        right = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == ')') {
                right++;
                result += ")";
            }
            else if (right > left && array[i] == '(') {
                left++;
                result += "(";
            }
        }
        return S.length() - result.length();
    }
}