class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        
        int[] rowMinNum = new int[rowSize];
        int[] colMaxNum = new int[colSize];
        
        Arrays.fill(rowMinNum, Integer.MAX_VALUE);
        Arrays.fill(colMaxNum, Integer.MIN_VALUE);
        
        int rowIndex, colIndex;
        
        for (rowIndex = 0; rowIndex < rowSize; rowIndex++) {
            for (colIndex = 0; colIndex < colSize; colIndex++) {
                rowMinNum[rowIndex] = Math.min(rowMinNum[rowIndex], matrix[rowIndex][colIndex]);
                colMaxNum[colIndex] = Math.max(colMaxNum[colIndex], matrix[rowIndex][colIndex]);
            }
        }
        
        List<Integer> luckyNumbers = new ArrayList<>();
        for (rowIndex = 0; rowIndex < rowSize; rowIndex++) {
            for (colIndex = 0; colIndex < colSize; colIndex++) {
                if (rowMinNum[rowIndex] == colMaxNum[colIndex]) {
                    luckyNumbers.add(rowMinNum[rowIndex]);
                    break;
                }
            }
        }
        
        return luckyNumbers;
    }
}