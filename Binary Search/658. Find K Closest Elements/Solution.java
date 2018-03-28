class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new LinkedList<>();
        int left = findLowerClosest(arr, x);
        int right = left + 1;
        for (int i = 0; i < k; i++) {
            if (isLeftCloser(arr, x, left, right)) {
                result.add(arr[left]);
                left--;
            }
            else {
                result.add(arr[right]);
                right++;
            }
        }
        Collections.sort(result);
        return result;
    }
    
    public boolean isLeftCloser(int[] arr, int target, int left, int right) {
        if (left < 0) {
            return false;
        }
        if (right >= arr.length) {
            return true;
        }
        int leftDiff = target - arr[left];
        int rightDiff = arr[right] - target;
        if (leftDiff != rightDiff) {
            return leftDiff < rightDiff;
        }
        return true;
    }
    
    public int findLowerClosest(int[] arr, int target) {
        // Find the last position that smaller than target
        int start = 0;
        int end = arr.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid;
            }
            else {
                end = mid;
            }
        }
        if (arr[end] < target) {
            return end;
        }
        if (arr[start] < target) {
            return start;
        }
        return -1;
    }
}