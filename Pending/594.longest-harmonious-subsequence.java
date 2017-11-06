public class Solution {
    public int findLHS(int[] nums) {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	int result = 0;
	for (int num : nums) {
	    map.put(num, map.getOrDefault(num, 0) + 1);
	    if (map.containsKey(num + 1)) {
	        result = Math.max(result, map.get(num + 1) + map.get(num));
	    }
	    if (map.containsKey(num - 1)) {
	        result = Math.max(result, map.get(num - 1) + map.get(num));
	    }
	}
	return result;
    }
}
