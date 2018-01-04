// I : 1, V : 5, X : 10, L : 50, C : 100, D : 500, M : 1000

class Solution {
    public String intToRoman(int num) {
        int[] numArr = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strArr = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String result = "";
        
        for (int i = 0; i < numArr.length; i++) {
            while (num >= numArr[i]) {
                result += strArr[i];
                num -= numArr[i];
            }
        }
        return result;
    }
}