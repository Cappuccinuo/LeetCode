class Solution {
    public int search(ArrayReader reader, int target) {
        int max = 1;
        while (reader.get(max) < target) {
            max = max * 2;
        }
        
        int start = 0;
        int end = max;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            int val = reader.get(mid);
            if (val == target) {
                return mid;
            }
            else if (val > target) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        
        if (reader.get(start) == target) {
            return start;
        }
        if (reader.get(end) == target) {
            return end;
        }
        
        return -1;
    }
}