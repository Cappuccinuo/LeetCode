//2018.4.10
class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }
        int n = nums.length;
        k = k % n;
        int[] replace = new int[n];
        for (int i = 0; i < n; i++) {
            replace[(i + k) % n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = replace[i];
        }
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }

        int n = nums.length;
        k = k % n;
        swapArray(nums, 0, n - k - 1);
        swapArray(nums, n - k, n - 1);
        swapArray(nums, 0, n - 1);
    }
    
    public void swapArray(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }
        int n = nums.length;
        k = k % n;
        List<Integer> translist = new ArrayList<>();
        assignValue(nums, n - k, n, translist);
        assignValue(nums, 0, n - k, translist);
        
        for (int i = 0; i < translist.size(); i++) {
            nums[i] = translist.get(i);
        }
    }
    
    public void assignValue(int[] nums, int left, int right, List<Integer> translist) {
        for (int i = left; i < right; i++) {
            translist.add(nums[i]);
        }
    }
}


// Before
class Solution1 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        List<Integer> result = new ArrayList<>();
        assignValue(nums, len - k, len, result);
        assignValue(nums, 0, len - k, result);
        for (int i = 0; i < len; i++) {
            nums[i] = result.get(i);
        }
    }
    
    public void assignValue(int[] nums, int l, int r, List<Integer> result) {
        for (int i = l; i < r; i++) {
            result.add(nums[i]);
        }
    }
}

class Solution2 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }
    
    public void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
    }
}

class Solution3 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] replace = new int[len];
        for (int i = 0; i < len; i++) {
            replace[(i + k) % len] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = replace[i];
        }
    }
}