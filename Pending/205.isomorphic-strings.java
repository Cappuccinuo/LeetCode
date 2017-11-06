public class Solution {
    public boolean isIsomorphic(String s, String t) {
	if (s == null || s.length() == 0) {
	    return true;
	}
	Map<Character, Character> map = new HashMap<Character, Character>();
	for (int i = 0; i < s.length(); i++) {
	    char charS = s.charAt(i);
	    char charT = t.charAt(i);
	    if (map.containsKey(charS)) {
	        if (map.get(charS).equals(charT)) {
		    continue;
		}
		return false;
	    }
	    else {
		if (!map.containsValue(charT)) {
	            map.put(charS, charT);  
		}    
		else {
		    return false;
		}
	    }
	}
	return true;        
    }
}
