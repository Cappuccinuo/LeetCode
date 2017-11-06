public class Solution {
    public String reverseWords(String s) {
    	String[] words = s.split(" ");
	StringBuilder result = new StringBuilder();
	for (String word : words) {
	    result.append(new StringBuffer(word).reverse().toString() + " ");
	}
	return result.toString().trim();
    }
}
