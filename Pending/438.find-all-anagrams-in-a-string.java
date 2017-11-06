public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	List<Integer> list = new LinkedList<Integer>();
	if (p.length() > s.length() || s.length() == 0 || s== null || p.length() == 0 || p == null) {
	    return list;
	}      
	for (char c : p.toCharArray()) {
	    map.put(c, map.getOrDefault(c, 0) + 1);
	}
	int count = map.size();
	int begin = 0;
	int end = 0;
	
	while (end < s.length()) {
	    char c = s.charAt(end);
	    if (map.containsKey(c)) {
	        map.put(c, map.get(c) - 1);
	        if (map.get(c) == 0) {
		    count--;
		}
	    }
	    end++;
	    while (count == 0) {
	        char tempC = s.charAt(begin);
		if (map.containsKey(tempC)) {
		    map.put(tempC, map.get(tempC) + 1);
		    if (map.get(tempC) > 0) {
		        count++;
		    }
		}
		if (end - begin == p.length()) {
		    list.add(begin);
		}
		begin++;
	    }
	}
	return list;
    }
}
