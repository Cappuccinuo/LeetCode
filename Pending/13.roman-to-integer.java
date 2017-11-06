public class Solution {
    public int romanToInt(String s) {
	int[] map = new int[400];
	map['I'] = 1;
	map['V'] = 5;
	map['X'] = 10;
	map['L'] = 50;
	map['C'] = 100;
	map['D'] = 500;
	map['M'] = 1000;
	
	char[] ch = s.toCharArray();
	int sum = map[ch[0]];

	for (int i = 0; i < ch.length - 1; i++) {
	    if (map[ch[i]] >= map[ch[i + 1]]) {
	        sum += map[ch[i+1]];
	    }
	    else {
	        sum = sum + map[ch[i + 1]] - 2 * map[ch[i]];
	    }
	}        
	return sum;
    }
}
