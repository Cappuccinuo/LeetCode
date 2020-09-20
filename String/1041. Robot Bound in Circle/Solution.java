class Solution {
    public boolean isRobotBounded(String instructions) {
        int start = 0;
        int end = 0;
        int[][] directions = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
        int d = 0;
        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'G') {
                start += directions[d][0];
                end += directions[d][1];
            } else if (instruction == 'L') {
                d = d - 1;
                if (d < 0) {
                    d = d + 4;
                }
            } else {
                d = d + 1;
                if (d >= 4) {
                    d = d - 4;
                }
            }
        }
        return (start == 0 && end == 0) || d != 0;
    }
}