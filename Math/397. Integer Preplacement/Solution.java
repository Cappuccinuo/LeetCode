class Solution {
    public int integerReplacement(int n) {
        int temp = n;
        int steps = 0;
        while (temp != 1) {
            steps++;
            if (temp % 2 == 0) {
                temp = temp >> 1;
            }
            else {
                if (temp == 3) {
                    temp = 2;
                    continue;
                }
                int x = (temp - 1) / 2;
                if (x % 2 == 0) {
                    temp--;
                }
                else {
                    temp++;
                }
            }
        }
        return steps;
    }
}