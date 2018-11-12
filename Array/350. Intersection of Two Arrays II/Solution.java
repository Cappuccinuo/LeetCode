class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0;
        int j = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] result = new int[len1];
        int index = 0;
        
        while (i < len1 && j < len2) {
            int num1 = nums1[i];
            int num2 = nums2[j];
            if (num1 < num2) {
                i++;
            }
            else if (num1 > num2) {
                j++;
            }
            else {
                result[index++] = num1;
                i++;
                j++;
            }
        }
        
        return Arrays.copyOfRange(result, 0, index);
    }
}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        
        int[] res = new int[result.size()];
        int index = 0;
        for (int r : result) {
            res[index++] = r;
        }
        return res;
    }
}