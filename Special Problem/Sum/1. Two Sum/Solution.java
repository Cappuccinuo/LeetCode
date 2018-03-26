// 2018.3.25
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }
}
// 2018.3.25
class Solution {
    class Pair {
        Integer value;
        Integer index;
        Pair(Integer value, Integer index) {
            this.value = value;
            this.index = index;
        }
        Integer getValue() {
            return this.value;
        }
    }
    
    class valueComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair p1, Pair p2) {
            return p1.getValue() - p2.getValue();
        }
    }
    
    public int[] twoSum(int[] nums, int target) {
        Pair[] numbers = new Pair[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = new Pair(nums[i], i);
        }
        Arrays.sort(numbers, new valueComparator());
        int n = numbers.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int sum = numbers[start].getValue() + numbers[end].getValue();
            if (sum == target) {
                Pair num1 = numbers[start];
                Pair num2 = numbers[end];
                int[] result = new int[2];
                result[0] = Math.min(num1.index, num2.index);
                result[1] = Math.max(num1.index, num2.index);
                return result;
            }
            else if (sum < target) {
                start++;
            }
            else {
                end--;
            }
        }
        return new int[2];
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int numsLen = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int needSum = target - nums[i];
            if (map.containsKey(needSum)) {
                result[0] = map.get(needSum);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}