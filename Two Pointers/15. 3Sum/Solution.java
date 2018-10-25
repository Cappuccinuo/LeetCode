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
        // Using the bucket sort thought
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }
        int len = max - min + 1;
        visited = new boolean[len];
        freq = new int[len];
        // Get the freq of each num in nums
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i] - min]++;
        }
        
        // Traverse each freq
        for (int i = 0; i < len; i++) {
            // If the number exist
            if (freq[i] != 0) {
                // We don't want the smaller number to be added again, keep order a <= b <= c
                for (int j = i; j < len; j++) {
                    visited[j] = false;
                }
                // Use the number, as we will never use the num again, so no need to recover
                freq[i]--;
                // Using hash like two sum, the desired target is -(i + min)
                twoSumHelper(nums, -(i + min), min, max);
            }
        }
        return result;
    }
    
    private void twoSumHelper(int[] nums, int sum, int min, int max) {
        for (int i = 0; i < nums.length; i++) {
            int secondPick = sum - nums[i];
            int firstPick = -sum;
            // Only use the number larger or equal to the origin number we pick
            if (secondPick >= firstPick && secondPick <= max && nums[i] >= firstPick && freq[nums[i] - min] > 0) {
                List<Integer> list = new LinkedList<>();
                // Use nums[i]
                freq[nums[i] - min]--;
                if (!visited[secondPick - min] && freq[secondPick - min] > 0) {
                    list.add(firstPick);
                    list.add(nums[i]);
                    list.add(secondPick);
                    visited[secondPick - min] = true;
                    visited[nums[i] - min] = true;
                    result.add(list);
                }
                // This time we need to recover, as we may traverse back later
                freq[nums[i] - min]++;
            }
        }
    }
}