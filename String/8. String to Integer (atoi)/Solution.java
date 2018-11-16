// Corner case : "+", "20000000000000000", "    00000000012345678", "   00000000   "
class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        if (!isDigitOrSymbol(str.charAt(0))) {
            return 0;
        }
        int index = 0;
        boolean isNegative = false;
        if (str.charAt(index) == '-') {
            isNegative = true;
            index++;
        }
        else if (str.charAt(index) == '+') {
            index++;
        }
        if (index == str.length()) {
            return 0;
        }
        if (!Character.isDigit(str.charAt(index))) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        boolean findNonZero = false;
        while (index < str.length() && Character.isDigit(str.charAt(index))) {
            if (str.charAt(index) != '0') {
                findNonZero = true;
            }
            
            if (findNonZero) {
                sb.append(str.charAt(index));
            }
            
            index++;
        }
        if (sb.length() == 0) {
            return 0;
        }
        if (sb.length() > 10) {
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        long result = isNegative ? -Long.parseLong(sb.toString()) : Long.parseLong(sb.toString());
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } 
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        int res = (int)result;
        return res;
    }
    
    private boolean isDigitOrSymbol(char c) {
        return c == '+' || c == '-' || Character.isDigit(c);
    }
}