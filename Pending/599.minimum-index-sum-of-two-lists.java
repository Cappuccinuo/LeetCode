public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
	Map<String, Integer> map = new HashMap<String, Integer>();
	for (int i = 0; i < list1.length; i++) {
	    map.put(list1[i], i);
	}
	int min_sum = Integer.MAX_VALUE;
	int sum;
	List<String> list = new ArrayList<String>();

	for (int j = 0; j < list2.length; j++) {
	    if (map.containsKey(list2[j])) {
	        sum = j + map.get(list2[j]);
		if (sum < min_sum) {
		    list.clear();
		    list.add(list2[j]);
		    min_sum = sum;
		}
		else if (sum == min_sum) {
		    list.add(list2[j]);
		}
	    }
	}
	return list.toArray(new String[list.size()]);
    }
}
