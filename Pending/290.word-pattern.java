public class Solution {
    public boolean wordPattern(String pattern, String str) {
	Map<Character, String> map = new HashMap<Character, String>();
	char[] ch = pattern.toCharArray();
	String[] strs = str.split(" ");
	if (strs.length != pattern.length()) {
	    return false;
        }
	for (int i = 0; i < ch.length; i++) {
	    if (map.containsKey(ch[i])) {
		if (map.get(ch[i]).equals(strs[i])) {
		    continue;
		}
	    	else {
		    return false;
		}
	    }
	    else {
	        if (!map.containsValue(strs[i])) {
	            map.put(ch[i], strs[i]);
	 	}
		else {
		    return false;
		}
	    }
	}
	return true;        
    }
}
