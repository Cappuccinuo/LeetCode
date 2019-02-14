// The basic idea is that the SecondMin value will be 
// updated only if there is at least one smaller value before it.

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= min) {
                min = num;
            }
            else if (num <= smin) {
                smin = num;
            }
            else {
                return true;
            }
        }
        return false;
    }
}

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int k = 3;
        int[] min = new int[k - 1];
        Arrays.fill(min, Integer.MAX_VALUE);
        for (int num : nums) {
            int i = 0;
            while (i < k - 1 && num > min[i]) {
                i++;
            }
            
            if (i < k - 1) {
                min[i] = num;
            }
            else {
                return true;
            }
        }
        return false;
    }
}