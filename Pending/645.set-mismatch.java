public class Solution {
    public int[] findErrorNums(int[] nums) {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	int n = nums.length;
	int duplicate = 0;
	long sum = (n * (n + 1)) / 2;  
	for (int i : nums) {
	    map.put(i, map.getOrDefault(i, 0) + 1);
	    if (map.get(i) == 2) {
	        duplicate = i;
	    }
	    sum = sum - i;
	}
	return new int[]{duplicate, (int)sum + duplicate};
    }
}
