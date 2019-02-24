class Solution {
    public int[] singleNumber(int[] nums) {
        int xorOfTwo = 0;
        for (int num : nums) {
            xorOfTwo = xorOfTwo ^ num;
        }
        
        int lastDigit = xorOfTwo & (-xorOfTwo);
        
        int first = 0;
        int second = 0;
        for (int num : nums) {
            if ((num & lastDigit) == 0) {
                first = first ^ num;
            }
            else {
                second = second ^ num;
            }
        }
        return new int[]{first, second};
    }
}

class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        int xorBoth = 0;
        for (int num : nums) {
            xorBoth = xorBoth ^ num;
        }
        
        int bitmask = 1;
        for (int i = 0; i < 32; i++) {
            if ((xorBoth & bitmask) != 0) {
                break;
            }
            bitmask = bitmask << 1;
        }
        
        int first = 0;
        int second = 0;
        for (int num : nums) {
            if ((num & bitmask) != 0) {
                first = first ^ num;
            }
            else {
                second = second ^ num;
            }
        }
        result[0] = first;
        result[1] = second;
        return result;
    }
}