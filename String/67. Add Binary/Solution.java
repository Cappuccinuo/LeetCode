class Solution {
    public String addBinary(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int carry = 0;
        for (int i = 0; i < Math.max(alen, blen); i++) {
            int x = (i < alen) ? a.charAt(alen - i - 1) - '0' : 0;
            int y = (i < blen) ? b.charAt(blen - i - 1) - '0' : 0;
            sum = x + y + carry;
            
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        
        return sb.reverse().toString();
    }
}