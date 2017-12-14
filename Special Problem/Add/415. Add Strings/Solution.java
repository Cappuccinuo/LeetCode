class Solution {
    public String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int carry = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < Math.max(len1, len2); i++) {
            int x = (i < len1) ? (num1.charAt(len1 - i - 1) - '0') : 0;
            int y = (i < len2) ? (num2.charAt(len2 - i - 1) - '0') : 0;
            int sum = x + y + carry;
            
            sb.append(sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}