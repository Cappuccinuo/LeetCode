public class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				upperCount++;
			}
		}
		
		if (upperCount == 1 && Character.isUpperCase(word.charAt(0))) {
			return true;
		}
		else if (upperCount == 0) {
			return true;
		}
		else if (upperCount == word.length()) {
			return true;
		}
		else {
			return false;
		}
    }
}
