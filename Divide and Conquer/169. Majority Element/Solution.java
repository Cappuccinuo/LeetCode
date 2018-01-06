class Solution {
    public int majorityElement(int[] nums) {
        return majorityElementHelper(nums, 0, nums.length - 1);
    }
    
    public int majorityElementHelper(int[] nums, int lo, int hi) {
        if (lo == hi) {
            return nums[lo];
        }
        
        int mi = lo + (hi - lo) / 2;
        int left = majorityElementHelper(nums, lo, mi);
        int right = majorityElementHelper(nums, mi + 1, hi);
        
        if (left == right) {
            return left;
        }
        
        int leftCount = findElementCount(nums, lo, hi, left);
        int rightCount = findElementCount(nums, lo, hi, right);
        return leftCount > rightCount ? left : right;
    }
    
    public int findElementCount(int[] nums, int lo, int hi, int target) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == target) {
                count++;
            }
        }
        return count;
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.length / 2) {
                result = num;
                break;
            }
        }
        return result;
    }
}