class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                int prev = result.get(i - 1).get(j) + result.get(i - 1).get(j - 1);
                temp.add(prev);
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}