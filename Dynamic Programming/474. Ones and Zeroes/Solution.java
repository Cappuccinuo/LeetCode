class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String str : strs) {
            strInformation strInfo = new strInformation(str);
            for (int currM = m; currM >= strInfo.zeroNum; currM--) {
                for (int currN = n; currN >= strInfo.oneNum; currN--) {
                    dp[currM][currN] = Math.max(dp[currM][currN], 
                                                dp[currM - strInfo.zeroNum][currN - strInfo.oneNum] + 1);
                }
            }
        }
        return dp[m][n];
    }
}

class strInformation {
    int zeroNum;
    int oneNum;
    String str;
    
    strInformation(String str) {
        this.str = str;
        int zero = 0;
        int one = 0;
        for (char c : str.toCharArray()) {
            if (c == '0') { zero++;}
            else { one++; }
        }
        this.zeroNum = zero;
        this.oneNum = one;
    }
}