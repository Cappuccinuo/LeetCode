class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        if (n % 2 == 0) {
            return (findKth(nums1, nums2, n / 2) + findKth(nums1, nums2, n / 2 + 1)) / 2.0;
        }
        return findKth(nums1, nums2, n / 2 + 1);
    }
    
    private int findKth(int[] A, int[] B, int k) {
        if (A.length == 0) {
            return B[k - 1];
        }
        if (B.length == 0) {
            return A[k - 1];
        }
        int start = Math.min(A[0], B[0]);
        int end = Math.max(A[A.length - 1], B[B.length - 1]);
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (countSmallOrEqual(A, mid) + countSmallOrEqual(B, mid) < k) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        
        if (countSmallOrEqual(A, start) + countSmallOrEqual(B, start) >= k) {
            return start;
        }
        return end;
    }
    
    private int countSmallOrEqual(int[] array, int num) {
        int start = 0;
        int end = array.length - 1;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] <= num) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        
        if (array[start] > num) {
            return start;
        }
        
        if (array[end] > num) {
            return end;
        }
        
        return array.length;
    }
}