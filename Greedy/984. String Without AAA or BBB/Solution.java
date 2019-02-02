class Solution {
    public String strWithout3a3b(int A, int B) {
        StringBuilder sb = new StringBuilder();
        
        while (A > 0 || B > 0) {
            boolean writeA = false;
            
            int L = sb.length();
            if (L >= 2 && sb.charAt(L - 1) == sb.charAt(L - 2)) {
                if (sb.charAt(L - 1) == 'b') {
                    writeA = true;
                }  
            }
            else if (A >= B) {
                writeA = true;
            }
            
            if (writeA) {
                sb.append('a');
                A--;
            }
            else {
                sb.append('b');
                B--;
            }
        }
        
        return sb.toString();
    }
}