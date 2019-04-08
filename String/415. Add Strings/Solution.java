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

class Solution {
    public String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i;
        int j;
        for (i = len1 - 1, j = len2 - 1; i >= 0 && j >= 0; i--, j--) {
            int a = num1.charAt(i) - '0';
            int b = num2.charAt(j) - '0';
            int sum = a + b + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;
        }
        
        while (i >= 0) {
            int a = num1.charAt(i--) - '0';
            int sum = a + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;
            if (carry == 0) {
                sb.insert(0, num1.substring(0, i + 1));
                break;
            }
        }
        
        while (j >= 0) {
            int b = num2.charAt(j--) - '0';
            int sum = b + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;
            if (carry == 0) {
                sb.insert(0, num2.substring(0, j+ 1));
                break;
            }
        }
        
        if (carry != 0) {
            sb.insert(0, carry);
        }
        
        return sb.toString();
    }
}