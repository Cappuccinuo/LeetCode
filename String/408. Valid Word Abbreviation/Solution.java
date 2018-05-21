class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        if (word == null || abbr == null) {
            return false;
        }
        int index = 0;
        int num = 0;
        for (char ch : abbr.toCharArray()) {
            if (ch == '0' && num == 0) {
                return false;
            } 
            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            }
            else {
                index += num;
                if (index >= word.length() || word.charAt(index) != ch) {
                    return false;
                }
                num = 0;
                index++;
            }
        }
        return num + index == word.length() ? true : false;
    }
}