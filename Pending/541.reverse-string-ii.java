public class Solution {
    public String reverseStr(String s, int k) {
    	char[] ch = s.toCharArray();
	for (int left = 0; left < ch.length; left += 2 * k) {
	    for (int i = left, j = Math.min(left + k - 1, ch.length - 1); i < j; i++, j--) {
	        char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	    }
	}
	return new String(ch);
    }
}
