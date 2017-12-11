class Solution {
    private static final String[] letterMap = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private List<String> result = new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
        combination("", digits, 0);
        return result;
    }
    
    public void combination(String current, String digits, int completeDigits) {
        int digitLen = digits.length();
        if (digitLen == 0) {
            return;
        }
        if (completeDigits >= digitLen) {
            result.add(current);
            return;
        }
        String letters = letterMap[digits.charAt(completeDigits) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            combination(current + letters.charAt(i), digits, completeDigits + 1);
        }
    }
}