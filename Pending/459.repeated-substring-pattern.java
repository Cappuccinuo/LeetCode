public class Solution {
    public boolean repeatedSubstringPattern(String s) {
	int len = s.length();
	int next[] = new int[len];
	next[0] = 0;
	for (int i = 1, k = 0; i < len; i++) {
	    while (k > 0 && s.charAt(i) != s.charAt(k)) {
	        k = next[k - 1];
	    }
	    if (s.charAt(i) == s.charAt(k)) {
                k++;
	    }
	    next[i] = k;
	}       
	int lenSub = len - next[len - 1];
	return lenSub != len && len % lenSub == 0; 
    }
}
