// 28 ms
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int sum = map.get(list2[j]) + j;
                if (sum < minSum) {
                    result.clear();
                    result.add(list2[j]);
                    minSum = sum;
                }
                else if (sum == minSum) {
                    result.add(list2[j]);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
}

// 163 ms
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (!map.containsKey(i + j)) {
                        List<String> list = new ArrayList<>();
                        map.put(i + j, list);
                    }
                    map.get(i + j).add(list1[i]);
                }
            }
        }
        int sum = Integer.MAX_VALUE;
        for (Integer i : map.keySet()) {
            sum = Math.min(sum, i);
        }
        List<String> result = map.get(sum);
        return result.toArray(new String[result.size()]);
    }
}