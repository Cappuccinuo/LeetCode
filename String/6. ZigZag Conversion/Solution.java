class Solution {
    public String convert(String s, int numRows) {        
        int count = 0;
        int strLen = s.length();
        
        if (strLen <= numRows || numRows == 1) {
            return s;
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (count < numRows) {
            int start = count;
            int diffBetMainCol = 2 * numRows - 2;
            while (start < strLen) {
                sb.append(s.charAt(start));
                if (count != 0 && count != numRows - 1) {
                    int diffInMidLine = 2 * numRows - 2 - 2 * count;
                    if (start + diffInMidLine < strLen) {
                        sb.append(s.charAt(start + diffInMidLine));
                    }
                }
                start = start + diffBetMainCol;
            }
            count++;
        }
        
        return(sb.toString());
    }
}