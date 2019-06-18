class Solution {
    public void duplicateZeros(int[] arr) {
        int i;
        int j;
        int len = arr.length;
        for (i = 0, j = 0; i < len && j < len; i++, j++) {
            if (arr[i] == 0) {
                j++;
            }
        }

        for (i = i - 1; i >= 0; i--) {
            if (--j < len) {
                arr[j] = arr[i];
            }
            if (arr[i] == 0 && --j < len) {
                arr[j] = arr[i];
            }
        }
    }
}

class Solution {
    public void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int num : arr) {
            queue.offer(num);
        }
        int len = arr.length;
        int index = 0;
        while (index < len) {
            int top = queue.poll();
            if (top == 0) {
                arr[index++] = 0;
                if (index == len) {
                    break;
                } 
                arr[index++] = 0;
            }
            else {
                arr[index++] = top;
            }
        }
    }
}