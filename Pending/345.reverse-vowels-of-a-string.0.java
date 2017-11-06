public class Solution {
    public String reverseVowels(String s) {
	char[] ch = s.toCharArray();
	Set<Character> vowels = new HashSet<>(Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}));
	for (int i = 0, j = s.length() - 1; i < j;) {
	    if (!vowels.contains(ch[i])) {
	        i++;
	        continue;
	    }
	    if (!vowels.contains(ch[j])) {
		j--;
	        continue;
	    }
            char temp = ch[i];
	    ch[i] = ch[j];
	    ch[j] = temp;
	    i++;
	    j--;
	}
	return String.valueOf(ch);
    }
}
