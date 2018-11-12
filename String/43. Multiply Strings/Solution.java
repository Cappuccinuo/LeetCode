class Solution {
    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return null;
        }
        int len1 = num1.length();
        int len2 = num2.length();
        int[] pos = new int[len1 + len2];
        int i, j, a, b, carry, mul, sum;
        for (i = len1 - 1; i >= 0; i--) {
            a = num1.charAt(i) - '0';
            carry = 0;
            for (j = len2 - 1; j >= 0; j--) {
                b = num2.charAt(j) - '0';
                mul = a * b;
                sum = mul + carry + pos[i + j + 1];
                pos[i + j + 1] = sum % 10;
                carry = sum / 10;
            }
            pos[i + j + 1] = carry;
        } 
        
        StringBuilder sb = new StringBuilder();
        i = 0;
        while (i < len1 + len2 - 1 && pos[i] == 0) {
            i++;
        }
        while (i < len1 + len2) {
            sb.append(pos[i]);
            i++;
        }
        return sb.toString();
    }
}