class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        int min = nums1[0];
        int max = nums1[0];
        
        for (int num : nums1) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        boolean[] hasNum = new boolean[max - min + 1];
        for (int num : nums1) {
            hasNum[max - num] = true;
        }
        
        int index = 0;
        int[] result = new int[max - min + 1];
        for (int num : nums2) {
            if (num >= min && num <= max && hasNum[max - num]) {
                result[index++] = num;
                hasNum[max - num] = false;
            }
        }
        
        return Arrays.copyOfRange(result, 0, index);
    }
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();
        Set<Integer> num1 = new HashSet();
        for (int num : nums1) {
            num1.add(num);
        }
        for (int num : nums2) {
            if (num1.contains(num)) {
                set.add(num);
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int s : set) {
            result[index++] = s;
        }
        return result;
    }
}