// 2018.3.26
class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> threeSum(int[] nums) {
        result = new LinkedList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            twoSum(nums, left, right, target);
        }
        return result;
    }
    
    public void twoSum(int[] nums, int left, int right, int target) {
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                List<Integer> list = new LinkedList<>();
                list.add(-target);
                list.add(nums[left]);
                list.add(nums[right]);
                result.add(list);
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            }
            else if (nums[left] + nums[right] < target) {
                left++;
            }
            else {
                right--;
            }
        }
    }
}




class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int numsLen = nums.length;
        List<List<Integer>> result = new LinkedList<>();
        
        for (int i = 0; i < numsLen - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int lo = i + 1;
                int hi = numsLen - 1;
                int needSum = 0 - nums[i];
                twoSum(nums, i, lo, hi, needSum, result);
            }
        }
        
        return result;
    }
    
    public void twoSum (int[] nums, int currentIndex, int lo, int hi, int needSum, List<List<Integer>> result) {
        while (lo < hi) {
            int currentSum = nums[lo] + nums[hi];
            if (currentSum == needSum) {
                result.add(Arrays.asList(nums[currentIndex], nums[lo], nums[hi]));
                while (lo < hi && nums[lo] == nums[lo + 1]) { lo++; }
                while (lo < hi && nums[hi] == nums[hi - 1]) { hi--; }
                lo++;
                hi--;
            }
            else {
                if (currentSum < needSum) { lo++; }
                else { hi--; }
            }
        }
    }
}