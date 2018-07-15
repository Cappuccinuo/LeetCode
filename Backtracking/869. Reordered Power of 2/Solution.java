// 2018.7.15 During Contest
class Solution {
    boolean flag = false;
    
    public boolean reorderedPowerOf2(int N) {
        if (isPowerOfTwo(N)) {
            return true;
        }
        String number = String.valueOf(N);
        char[] array = number.toCharArray();
        int[] nums = new int[number.length()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = array[i] - '0';
        }
        generateHelper(nums);
        return flag;
    }
    
    private void generateHelper(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        boolean[] visited = new boolean[n];
        DFS(nums, visited, new LinkedList<>());
    }
    
    private int getNum(List<Integer> permutation) {
        StringBuilder sb = new StringBuilder();
        for (int i : permutation) {
            sb.append(i);
        }
        return Integer.parseInt(sb.toString());
    }
    
    private void DFS(int[] nums, boolean[] visited, List<Integer> permutation) {
        if (flag) {
            return;
        }
        
        if (permutation.size() == nums.length && permutation.get(0) != 0) {
            int temp = getNum(permutation);
            if (isPowerOfTwo(temp)) {
                flag = true;
            }
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }
            
            permutation.add(nums[i]);
            visited[i] = true;
            DFS(nums, visited, permutation);
            permutation.remove(permutation.size() - 1);
            visited[i] = false;
        }
    }
    
    private boolean isPowerOfTwo(int N) {
        return (N & (N - 1)) == 0;
    }
}

// 2018.7.15
class Solution {
    public boolean reorderedPowerOf2(int N) {
        int[] A = count(N);
        
        for (int i = 0; i < 31; i++) {
            if (Arrays.equals(A, count(1 << i))) {
                return true;
            }
        }
        return false;
    }
    
    private int[] count(int N) {
        int[] res = new int[10];
        
        String str = String.valueOf(N);
        for (char c : str.toCharArray()) {
            res[c - '0']++;
        }
        
        return res;
    }
}