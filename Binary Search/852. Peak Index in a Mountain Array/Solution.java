class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int len = A.length;
        int start = 1;
        int end = len - 2;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] < A[mid + 1]) {
                start = mid;
            }
            else if (A[mid] < A[mid - 1]) {
                end = mid;
            }
            else {
                return mid;
            }
        }
        
        if (A[start] < A[end]) {
            return end;
        }
        return start;
    }
}

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int max = A[0];
        int mountainIndex = 0;
        int len = A.length;
        
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > max) {
                max = A[i];
                mountainIndex = i;
            }
        }
        
        return mountainIndex;
    }
}

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int len = A.length;
        int[] right = new int[len];
        int[] left = new int[len];
        
        int leftMost = A[0];
        left[0] = 0;
        for (int i = 1; i < len; i++) {
            if (A[i] > leftMost) {
                leftMost = A[i];
                left[i] = i;
            }
            else {
                left[i] = left[i - 1];
            }
        }
        
        int rightMost = A[len - 1];
        right[len - 1] = len - 1;
        for (int j = len - 2; j >= 0; j--) {
            if (A[j] > rightMost) {
                rightMost = A[j];
                right[j] = j;
            }
            else {
                right[j] = right[j + 1];
            }
        }
        
        for (int i = 1; i < len - 1; i++) {
            if (left[i] == right[i] && left[i + 1] == right[i - 1]) {
                return i;
            }
        }
        
        return -1;
    }
}