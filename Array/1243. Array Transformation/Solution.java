class Solution {
    public List<Integer> transformArray(int[] arr) {
        int len = arr.length;
        int[] temp = new int[len];
        int i;
        
        while (!Arrays.equals(arr, temp)) {
            temp = arr.clone();
            for (i = 1; i < len - 1; i++) {
                if (temp[i] > temp[i - 1] && temp[i] > temp[i + 1]) {
                    arr[i]--;
                }
                else if (temp[i] < temp[i - 1] && temp[i] < temp[i + 1]) {
                    arr[i]++;
                }
            }
        }
        
        return IntStream.of(arr).boxed().collect(Collectors.toList());
    }
}