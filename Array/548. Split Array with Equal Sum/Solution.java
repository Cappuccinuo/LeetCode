// O(n ^ 2)
class Solution {
    public boolean splitArray(int[] nums) {
        int len = nums.length;
        if (len < 7) {
            return false;
        }
        int[] prefixSum = new int[len];
        int i, j, k;
        prefixSum[0] = nums[0];
        for (i = 1; i < len; i++) {
            prefixSum[i] = nums[i] + prefixSum[i - 1];
        }
        
        for (i = 3; i < len - 3; i++) {
            Set<Integer> set = new HashSet();
            for (j = 1; j < i - 1; j++) {
                if (prefixSum[i - 1] - prefixSum[j] == prefixSum[j - 1]) {
                    set.add(prefixSum[j - 1]);
                }
            }
            
            for (k = i + 2; k < len - 1; k++) {
                if (prefixSum[len - 1] - prefixSum[k] == prefixSum[k - 1] - prefixSum[i]) {
                    if (set.contains(prefixSum[len - 1] - prefixSum[k])) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}

class Solution {
    public boolean splitArray(int[] nums) {
        // O(n^3)
        int len = nums.length;
        int[] prefixSum = new int[len];
        int i, j, k;
        prefixSum[0] = nums[0];
        for (i = 1; i < len; i++) {
            prefixSum[i] = nums[i] + prefixSum[i - 1];
        }
        
        int a, b, c, d;
        for (i = 0; i < len - 6; i++) {
            a = prefixSum[i];
            for (j = i + 2; j < len - 4; j++) {
                b = prefixSum[j] - prefixSum[i + 1];
                if (a != b) {
                    continue;
                }
                for (k = j + 2; k < len - 2; k++) {
                    c = prefixSum[k] - prefixSum[j + 1];
                    if (c != b) {
                        continue;
                    }
                    d = prefixSum[len - 1] - prefixSum[k + 1];
                    if (c == d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

// TLE
class Solution {
    public boolean splitArray(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int len = nums.length;
        
        int sum = 0;
        int total = 0;
        int i, a, b, c;
        for (i = 0; i < len; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                map.get(sum).add(i);
            }
            else {
                map.put(sum, new LinkedList<>());
                map.get(sum).add(i);
            }
            total += nums[i];
        }
        
        sum = nums[0];
        
        for (i = 1; i < len - 5; i++) {
            a = 2 * sum + nums[i];
            if (!map.containsKey(a)) {
                sum += nums[i];
                continue;
            }
            for (int j : map.get(a)) {
                j++;
                if (j > i + 1 && j < len - 3) {
                    b = 3 * sum + nums[i] + nums[j];
                    if (!map.containsKey(b)) {
                        continue;
                    }
                    for (int k : map.get(b)) {
                        k++;
                        if (k > j + 1 && k < len - 1) {
                            c = 4 * sum + nums[i] + nums[j] + nums[k];
                            if (c == total) {
                                return true;
                            }
                        }
                    }
                }
            }
            sum += nums[i];
        }
        
        return false;
    }
}