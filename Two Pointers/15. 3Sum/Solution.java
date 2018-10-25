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

// Without sort
class Solution { 
    int[] freq;
    boolean[] visited;
    List<List<Integer>> result;
    public List<List<Integer>> threeSum(int[] nums) {
        result = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }
        int len = max - min + 1;
        visited = new boolean[len];
        freq = new int[len];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i] - min]++;
        }
        
        for (int i = 0; i < len; i++) {
            if (freq[i] != 0) {
                for (int j = i; j < len; j++) {
                    visited[j] = false;
                }
                freq[i]--;
                twoSumHelper(nums, -(i + min), min, i, max);
                freq[i]++;
            }
        }
        return result;
    }
    
    private void twoSumHelper(int[] nums, int sum, int min, int ind, int max) {
        for (int i = 0; i < nums.length; i++) {
            int diff = sum - nums[i];
            if (diff >= min + ind && diff <= max && nums[i] >= min + ind && freq[nums[i] - min] > 0) {
                List<Integer> list = new LinkedList<>();
                freq[nums[i] - min]--;
                if (!visited[diff - min] && freq[diff - min] > 0) {
                    list.add(-sum);
                    list.add(nums[i]);
                    list.add(diff);
                    visited[diff - min] = true;
                    visited[nums[i] - min] = true;
                    result.add(list);
                }
                freq[nums[i] - min]++;
            }
        }
    }
}