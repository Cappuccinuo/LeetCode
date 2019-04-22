// 2019.4.22
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        Map<Integer, StringBuilder> map = new HashMap<>();
        int i;
        for (i = 0; i < numRows; i++) {
            map.put(i, new StringBuilder());
        }
        int currentRow = 0;
        boolean reverse = false;

        for (i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.get(currentRow).append(c);
            int nextRow = getNextRow(currentRow, reverse);
            
            if (nextRow < 0 || nextRow >= numRows) {
                reverse = !reverse;
                nextRow = getNextRow(currentRow, reverse);
            }
            currentRow = nextRow;
        }
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < numRows; i++) {
            sb.append(map.get(i));
        }
        return sb.toString();
    }
    
    private int getNextRow(int currentRow, boolean reverse) {
        return reverse ? currentRow - 1 : currentRow + 1;
    }
}


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

//2018.9.23
class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sbs = new StringBuilder[numRows];
        int len = s.length();
        int i = 0;
        
        for (int j = 0; j < numRows; j++) {
            sbs[j] = new StringBuilder();
        }
        
        while (i < len) {
            for (int index = 0; index < numRows && i < len; index++) {
                sbs[index].append(s.charAt(i));
                i++;
            }
            for (int index = numRows - 2; index >= 1 && i < len; index--) {
                sbs[index].append(s.charAt(i));
                i++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < numRows; j++) {
            sb.append(sbs[j]);
        }
        return sb.toString();
    }
}