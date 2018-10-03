class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        rainbowSort(nums, 0, nums.length - 1, 0, 2);
    }
    
    private void rainbowSort(int[] nums, int left, int right, int colorFrom, int colorTo) {
        if (left >= right || colorFrom >= colorTo) {
            return;
        }
        int midColor = colorFrom + (colorTo - colorFrom) / 2;
        int p = partition(nums, midColor, left, right);
        rainbowSort(nums, left, p - 1, colorFrom, midColor);
        rainbowSort(nums, p, right, midColor + 1, colorTo);
    }
    
    private int partition(int[] nums, int targetColor, int left, int right) {
        int index = left - 1;
        for (int i = left; i <= right; i++) {
            if (nums[i] <= targetColor) {
                index++;
                swap(nums, index, i);
            }
        }
        return index + 1;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

class Solution {
    public void sortColors(int[] nums) {
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        for (int num : nums) {
            if (num == 0) {
                cnt1++;
            }
            if (num == 1) {
                cnt2++;
            }
            if (num == 2) {
                cnt3++;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (cnt1 > 0) {
                nums[i] = 0;
                cnt1--;
            }
            else if (cnt2 > 0) {
                nums[i] = 1;
                cnt2--;
            }
            else {
                nums[i] = 2;
                cnt3--;
            }
        }
    }
}

class Solution {
    public void sortColors(int[] nums) {
        int one = 0;
        int two = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[two];
                nums[two] = nums[one];
                nums[one] = 0;
                one++;
                two++;
            }
            else if (nums[i] == 1) {
                nums[i] = nums[two];
                nums[two] = 1;
                two++;
            }
        }
    }
}