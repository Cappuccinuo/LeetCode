class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)) {
                list.add(i);
            }
        }
        return list;
    }
    
    public boolean isSelfDividingNumber(int x) {
        int temp = 0;
        int original = x;
        while (x != 0) {
            temp = x % 10;
            if (temp == 0) {
                return false;
            }
            if (original % temp != 0) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }
}