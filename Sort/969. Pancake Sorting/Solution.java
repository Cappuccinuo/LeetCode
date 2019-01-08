class Solution {
    public List<Integer> pancakeSort(int[] A) {
        List<Integer> result = new LinkedList<>();
        int N = A.length;
        
        for (int i = N; i >= 1; i--) {
            int largest = findLargest(A, i);
            flip(A, largest);
            result.add(largest + 1);
            flip(A, i - 1);
            result.add(i);
        }
        
        return result;
    }
    
    private int findLargest(int[] A, int index) {
        int max = 0;
        int ind = 0;
        for (int i = 0; i < index; i++) {
            if (A[i] > max) {
                max = A[i];
                ind = i;
            }
        }
        return ind;
    }
    
    private void flip(int[] A, int index) {
        int i = 0;
        int j = index;
        while (i < j) {
            swap(A, i, j);
            i++;
            j--;
        }
    }
    
    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}