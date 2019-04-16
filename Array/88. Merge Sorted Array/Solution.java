class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1 = m - 1;
        int l2 = n - 1;
        int index = m + n - 1;
        while (l1 >= 0 && l2 >= 0) {
            int a = nums1[l1];
            int b = nums2[l2];
            if (a > b) {
                nums1[index--] = a;
                l1--;
            }
            else {
                nums1[index--] = b;
                l2--;
            }
        }
        
        while (l2 >= 0) {
            nums1[index--] = nums2[l2--];
        }
    }
}