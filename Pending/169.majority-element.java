public class Solution {
    public int majorityElement(int[] nums) {
	int len = nums.length;
	int result = 0;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	for (int num : nums) {
	    map.put(num, map.getOrDefault(num, 0) + 1);
	    if (map.get(num) > len / 2) {
	        result = num;
		break;
	    }
	}        
	return result;
    }
}
