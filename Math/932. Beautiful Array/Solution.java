class Solution {
    public int[] beautifulArray(int N) {
        int[] result = new int[N];
        List<Integer> list = new ArrayList<>();
        list.add(1);
        
        while (list.size() < N) {
            List<Integer> temp = new ArrayList<>();
            
            for (int i : list) {
                if (2 * i - 1 <= N) {
                    temp.add(2 * i - 1);
                }
            }
            
            for (int i : list) {
                if (2 * i <= N) {
                    temp.add(2 * i);
                }
            }
            
            list = temp;
        }
        
        for (int i = 0; i < N; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}