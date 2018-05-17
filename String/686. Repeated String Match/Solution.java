class Solution {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder(A);
        int k = 1;
        
        while (sb.length() < B.length()) {
            sb.append(A);
            k++;
        }
        
        if (sb.indexOf(B) >= 0) {
            return k;
        }
        
        if (sb.append(A).indexOf(B) >= 0) {
            return k + 1;
        }
        
        return -1;
    }
}