// 2018.5.14
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        Map<Integer, String> map = new HashMap<>();
        Integer[] temp = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        Arrays.sort(temp, comp);

        for (int i = 1; i <= temp.length; i++) {
            if (i > 3) {
                map.put(temp[i - 1], String.valueOf(i));
            }
            else {
                if (i == 1) {
                    map.put(temp[i - 1], "Gold Medal");
                }
                if (i == 2) {
                    map.put(temp[i - 1], "Silver Medal");
                }
                if (i == 3) {
                    map.put(temp[i - 1], "Bronze Medal");
                }
            }
        }
        
        String[] result = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }
        return result;
    }
}